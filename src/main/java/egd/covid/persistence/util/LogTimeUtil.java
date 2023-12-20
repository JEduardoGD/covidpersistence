package egd.covid.persistence.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class LogTimeUtil extends StaticValuesHelper {

	private static final BigDecimal BD_3600 = BigDecimal.valueOf(3600);
	private static final BigDecimal BD_60 = BigDecimal.valueOf(60);

	protected LocalDateTime checkLog(String proceso, LocalDateTime dateTime1, long logEveryMinutes,
			LocalDateTime startProcessAt, long actualRegister, long totalRegister) {
		LocalDateTime dateTime2 = LocalDateTime.now();
		long diffInMinutes = ChronoUnit.MINUTES.between(dateTime1, dateTime2);
		if (diffInMinutes < logEveryMinutes) {
			return dateTime1;
		}
		long totalSecondsSinceStart = ChronoUnit.SECONDS.between(startProcessAt, dateTime2);
		BigDecimal hoursSinceStart = BigDecimal.valueOf(totalSecondsSinceStart).divide(BD_3600, 0, RoundingMode.DOWN);
		BigDecimal restInMinutesSinceStart = (BigDecimal.valueOf(totalSecondsSinceStart)
				.subtract(hoursSinceStart.multiply(BD_3600))).divide(BD_60, 0, RoundingMode.DOWN);

		// calculo de tiempo total:
		BigDecimal totalTimeSeconds = (BigDecimal.valueOf(totalRegister)
				.multiply(BigDecimal.valueOf(totalSecondsSinceStart)))
				.divide(BigDecimal.valueOf(actualRegister), 0, RoundingMode.DOWN);

		// calculo de tiempo faltante:
		BigDecimal timeLeftSeconds = totalTimeSeconds.subtract(BigDecimal.valueOf(totalSecondsSinceStart));
		BigDecimal timeLeftHours = timeLeftSeconds.divide(BD_3600, 0, RoundingMode.DOWN);
		BigDecimal timeLeftMinutes = (timeLeftSeconds.subtract(timeLeftHours.multiply(BD_3600))).divide(BD_60, 0,
				RoundingMode.DOWN);

		log.info("{}, Registro {} de {}, tiempo usado: {} horas, {} minutos; tiempo faltante: {} horas, {} minutos",
				proceso, actualRegister, totalRegister, hoursSinceStart, restInMinutesSinceStart, timeLeftHours,
				timeLeftMinutes);

		return dateTime2;
	}
}
