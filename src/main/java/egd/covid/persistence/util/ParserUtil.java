package egd.covid.persistence.util;

import java.util.Map;

import egd.covid.persistence.entity.CovidEntity;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class ParserUtil extends ParseUtilOperations {
	public static CovidEntity parse(String s, Map<Integer, Integer> mappers) {
		String[] arr = s.split(DELIMITATOR);
		if (arr.length > ARRAY_LENGTH) {
			log.error("La linea no cumple con la longitud: {}", s);
			for (int i = 0; i < arr.length; i++) {
				log.error("arr[{}] => {}", i, arr[i]);
			}
			return null;
		}

		CovidEntity ce = new CovidEntity();

		ce.setOrigen(parseString(arr, 0, mappers));
		ce.setSector(parseString(arr, 1, mappers));
		ce.setIdRegistro(parseLong(arr, 2, mappers));
		ce.setCveentuni(parseLong(arr, 3, mappers));
		ce.setCvemununi(parseLong(arr, 4, mappers));
		ce.setEntidad(parseString(arr, 5, mappers));
		ce.setDelega(parseString(arr, 6, mappers));
		ce.setUnidad(parseString(arr, 7, mappers));
		ce.setFechareg(parseDate(arr, 8, mappers));
		ce.setClues(parseString(arr, 9, mappers));
		ce.setFolioSinave(parseString(arr, 10, mappers));
		ce.setFolioImss(parseString(arr, 11, mappers));
		ce.setApepater(parseString(arr, 12, mappers));
		ce.setApemater(parseString(arr, 13, mappers));
		ce.setNombre(parseString(arr, 14, mappers));
		ce.setSexo(parseString(arr, 15, mappers));
		ce.setCurp(parseString(arr, 16, mappers));
		ce.setEntnaci(parseString(arr, 17, mappers));
		ce.setEntresi(parseString(arr, 18, mappers));
		ce.setCventine(parseLong(arr, 19, mappers));
		ce.setMpioresi(parseString(arr, 20, mappers));
		ce.setCvemuni(parseLong(arr, 21, mappers));
		ce.setLocresi(parseString(arr, 22, mappers));
		ce.setCvelocal(parseLong(arr, 23, mappers));
		ce.setLatloca(parseDouble(arr, 24, mappers));
		ce.setLongloca(parseDouble(arr, 25, mappers));
		ce.setTipacien(parseString(arr, 26, mappers));
		ce.setEvoluci(parseString(arr, 27, mappers));
		ce.setFegreso(parseDate(arr, 28, mappers));
		ce.setFecdef(parseDate(arr, 29, mappers));
		ce.setSemdef(parseLong(arr, 30, mappers));
		ce.setCertidef(parseString(arr, 31, mappers));
		ce.setDefporinf(parseString(arr, 32, mappers));
		ce.setDefverifi(parseString(arr, 33, mappers));
		ce.setIntubado(parseString(arr, 34, mappers));
		ce.setDigcline(parseString(arr, 35, mappers));
		ce.setFecnaci(parseDate(arr, 36, mappers));
		ce.setEdad(parseLong(arr, 37, mappers));
		ce.setNaciona(parseString(arr, 38, mappers));
		ce.setEstaemba(parseString(arr, 39, mappers));
		ce.setMesesemb(parseLong(arr, 40, mappers));
		ce.setDomicilio(parseString(arr, 41, mappers));
		ce.setCp(parseString(arr, 42, mappers));
		ce.setTelefono(parseString(arr, 43, mappers));
		ce.setEsindige(parseString(arr, 44, mappers));
		ce.setHableind(parseString(arr, 45, mappers));
		ce.setOcupacio(parseString(arr, 46, mappers));
		ce.setSeringre(parseString(arr, 47, mappers));
		ce.setFecingre(parseDateTime(arr, 48, mappers));
		ce.setFecinsi(parseDate(arr, 49, mappers));
		ce.setDiagprob(parseString(arr, 50, mappers));
		ce.setFiebre(parseString(arr, 51, mappers));
		ce.setTos(parseString(arr, 52, mappers));
		ce.setOdinogia(parseString(arr, 53, mappers));
		ce.setDisnea(parseString(arr, 54, mappers));
		ce.setIrritabi(parseString(arr, 55, mappers));
		ce.setDiarrea(parseString(arr, 56, mappers));
		ce.setDotoraci(parseString(arr, 57, mappers));
		ce.setCalosfrios(parseString(arr, 58, mappers));
		ce.setCefalea(parseString(arr, 59, mappers));
		ce.setMialgias(parseString(arr, 60, mappers));
		ce.setArtral(parseString(arr, 61, mappers));
		ce.setAtaedoge(parseString(arr, 62, mappers));
		ce.setRinorrea(parseString(arr, 63, mappers));
		ce.setPolipnea(parseString(arr, 64, mappers));
		ce.setVomito(parseString(arr, 65, mappers));
		ce.setDolabdo(parseString(arr, 66, mappers));
		ce.setConjun(parseString(arr, 67, mappers));
		ce.setCianosis(parseString(arr, 68, mappers));
		ce.setInisubis(parseString(arr, 69, mappers));
		ce.setAnosmia(parseString(arr, 70, mappers));
		ce.setDisgeusia(parseString(arr, 71, mappers));
		ce.setAsintomatico(parseString(arr, 72, mappers));
		ce.setDiabetes(parseString(arr, 73, mappers));
		ce.setEpoc(parseString(arr, 74, mappers));
		ce.setAsma(parseString(arr, 75, mappers));
		ce.setInmusupr(parseString(arr, 76, mappers));
		ce.setHiperten(parseString(arr, 77, mappers));
		ce.setOtracon(parseString(arr, 78, mappers));
		ce.setVihSida(parseString(arr, 79, mappers));
		ce.setEnfcardio(parseString(arr, 80, mappers));
		ce.setObesidad(parseString(arr, 81, mappers));
		ce.setInsrencr(parseString(arr, 82, mappers));
		ce.setTabaquis(parseString(arr, 83, mappers));
		ce.setRectrata(parseString(arr, 84, mappers));
		ce.setTxcrobia(parseString(arr, 85, mappers));
		ce.setTxantivi(parseString(arr, 86, mappers));
		ce.setAntivira(parseString(arr, 87, mappers));
		ce.setFecinitxantivi(parseDate(arr, 88, mappers));
		ce.setConocaso(parseString(arr, 89, mappers));
		ce.setContaves(parseString(arr, 90, mappers));
		ce.setConcerdo(parseString(arr, 91, mappers));
		ce.setConamina(parseString(arr, 92, mappers));
		ce.setVacunado(parseString(arr, 93, mappers));
		ce.setFecvaest(parseString(arr, 94, mappers));
		ce.setTommue(parseString(arr, 95, mappers));
		ce.setLabora(parseString(arr, 96, mappers));
		ce.setFollabor(parseString(arr, 97, mappers));
		ce.setRedesfin(parseString(arr, 98, mappers));
		ce.setRedesfin2(parseString(arr, 99, mappers));
		ce.setEsmigra(parseString(arr, 100, mappers));
		ce.setPaisnal(parseString(arr, 101, mappers));
		ce.setPaisori(parseString(arr, 102, mappers));
		ce.setFingmex(parseString(arr, 103, mappers));
		ce.setPaistran1(parseString(arr, 104, mappers));
		ce.setPaistran2(parseString(arr, 105, mappers));
		ce.setPaistran3(parseString(arr, 106, mappers));
		ce.setPaistran4(parseString(arr, 107, mappers));
		ce.setPuerperio(parseString(arr, 108, mappers));
		ce.setDiaspuerp(parseString(arr, 109, mappers));
		ce.setAntipireticos(parseString(arr, 110, mappers));
		ce.setUci(parseString(arr, 111, mappers));
		ce.setOrigenDatos(parseString(arr, 112, mappers));
		ce.setAsodic(parseString(arr, 113, mappers));
		ce.setAntigencovid(parseString(arr, 114, mappers));
		ce.setFecmueant(parseDate(arr, 115, mappers));
		ce.setClascovid19(parseString(arr, 116, mappers));
		ce.setClaflu(parseString(arr, 117, mappers));
		ce.setProtocolo(parseString(arr, 118, mappers));
		ce.setVacunaCov(parseString(arr, 119, mappers));
		ce.setTipoVacCov(parseString(arr, 120, mappers));
		ce.setFecVacCov(parseDate(arr, 121, mappers));
		ce.setRefVacCov(parseString(arr, 122, mappers));
		ce.setFecRefVacCov(parseDate(arr, 123, mappers));
		ce.setLinaje(parseString(arr, 124, mappers));
		ce.setViaje1(parseString(arr, 125, mappers));
		ce.setViaje2(parseString(arr, 126, mappers));
		ce.setViaje3(parseString(arr, 127, mappers));
		ce.setViaje4(parseString(arr, 128, mappers));
		ce.setViaje5(parseString(arr, 129, mappers));
		
		return ce;
	}
}
