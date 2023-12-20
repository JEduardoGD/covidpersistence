package egd.covid.persistence.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.regex.Pattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class ParseUtilOperations {

	protected static final String DELIMITATOR = "\\|{1,1}";
	protected static final int ARRAY_LENGTH = 130;
	private static final String EMPTY_STRING = "";
	private static final DateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
	private static final DateFormat DATE_TIME_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private static final Pattern REGEX_DATE_PATTERN = Pattern.compile("\\d{2}\\/\\d{2}\\/\\d{4}");
	private static final Pattern REGEX_DATE_TIME_PATTERN = Pattern
			.compile("\\d{4}\\-\\d{2}\\-\\d{2}\\s\\d{2}\\:\\d{2}\\:\\d{2}");

	protected static boolean isErrorInArrayOrLength(String[] arr, int position) {
		if (arr == null || arr.length <= position) {
			return true;
		}
		return false;
	}

	protected static boolean isErrorStringLength(String s, int position, Map<Integer, Integer> mappers) {
		if (mappers.get(position) != null) {
			return s.length() > mappers.get(position);
		}
		return false;
	}

	protected static boolean isNullOrEmptyString(String s) {
		if (s == null || EMPTY_STRING.equals(s)) {
			return true;
		}
		return false;

	}

	protected static String parseString(String[] arr, int position, Map<Integer, Integer> mappers) {
		if (isErrorInArrayOrLength(arr, position)) {
			return null;
		}
		String s = arr[position];

		if (isNullOrEmptyString(s)) {
			return null;
		}

		s = s.trim().replaceAll("\\s+", " ");

		if (isNullOrEmptyString(s)) {
			return null;
		}

		if (isErrorStringLength(s, position, mappers)) {
			log.error("La linea <<{}>> excede la longitud permitida: {}, posicion {}", s, mappers.get(position),
					position);
			return null;
		}
		return s;
	}

	protected static Long parseLong(String[] arr, int position, Map<Integer, Integer> mappers) {
		if (isErrorInArrayOrLength(arr, position)) {
			return null;
		}
		String s = arr[position];

		if (isNullOrEmptyString(s)) {
			return null;
		}

		s = s.trim();

		if (isNullOrEmptyString(s)) {
			return null;
		}

		if (isErrorStringLength(s, position, mappers)) {
			log.error("La linea <<{}>> excede la longitud permitida: {}, posicion {}", s, mappers.get(position),
					position);
			return null;
		}

		try {
			return Long.parseLong(s);
		} catch (NumberFormatException nfe) {
			log.error("la cadena {} no puede parsearse como long, posicion {}", s, position);
		}
		return null;
	}

	protected static Date parseDate(String[] arr, int position, Map<Integer, Integer> mappers) {
		if (isErrorInArrayOrLength(arr, position)) {
			return null;
		}
		String s = arr[position];

		if (isNullOrEmptyString(s)) {
			return null;
		}

		s = s.trim();

		if (isNullOrEmptyString(s)) {
			return null;
		}

		if (isErrorStringLength(s, position, mappers)) {
			log.error("La linea <<{}>> excede la longitud permitida: {}, posicion {}", s, mappers.get(position),
					position);
			return null;
		}
		try {
			return DATE_FORMAT.parse(s);
		} catch (ParseException e) {
			log.error("la cadena {} no puede parsearse como Date", s);
		}
		return null;
	}

	protected static Date parseDateTime(String[] arr, int position, Map<Integer, Integer> mappers) {
		if (isErrorInArrayOrLength(arr, position)) {
			return null;
		}
		String s = arr[position];

		if (isNullOrEmptyString(s)) {
			return null;
		}

		s = s.trim();

		if (isNullOrEmptyString(s)) {
			return null;
		}

		if (isErrorStringLength(s, position, mappers)) {
			log.error("La linea <<{}>> excede la longitud permitida: {}, posicion {}", s, mappers.get(position),
					position);
			return null;
		}

		try {
			if (REGEX_DATE_TIME_PATTERN.matcher(s).matches()) {
				return DATE_TIME_FORMAT.parse(s);
			}
			if (REGEX_DATE_PATTERN.matcher(s).matches()) {
				return DATE_FORMAT.parse(s);
			}
			log.error("la cadena {} no puede parsearse como Date o como Datetime", s);
		} catch (ParseException e) {
			log.error("la cadena {} no puede parsearse como Date", s);
		}

		return null;
	}

	protected static Double parseDouble(String[] arr, int position, Map<Integer, Integer> mappers) {
		if (isErrorInArrayOrLength(arr, position)) {
			return null;
		}
		String s = arr[position];

		if (isNullOrEmptyString(s)) {
			return null;
		}

		s = s.trim();

		if (isNullOrEmptyString(s)) {
			return null;
		}

		if (isErrorStringLength(s, position, mappers)) {
			log.error("La linea <<{}>> excede la longitud permitida: {}, posicion {}", s, mappers.get(position),
					position);
			return null;
		}
		try {
			return Double.parseDouble(s);
		} catch (NumberFormatException nfe) {
			log.error("la cadena {} no puede parsearse como Double", s);
		}
		return null;
	}
}
