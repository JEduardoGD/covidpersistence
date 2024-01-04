package egd.covid.persistence.entity.catalogo;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "T_MEDICO")
@NoArgsConstructor
public class Medico implements Serializable {
	private static final long serialVersionUID = 4621945598791925400L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDMEDICO")
	private Long id;

	@Column(name = "EMBARAZO")
	private Integer embarazo;

	@Column(name = "MESESEMB")
	private Long mesesemb;

	@Column(name = "FIEBRE")
	private Integer fiebre;

	@Column(name = "TOS")
	private Integer tos;

	@Column(name = "ODINOGIA")
	private Integer odinogia;

	@Column(name = "DISNEA")
	private Integer disnea;

	@Column(name = "IRRITABI")
	private Integer irritabi;

	@Column(name = "DIARREA")
	private Integer diarrea;

	@Column(name = "DOTORACI")
	private Integer dotoraci;

	@Column(name = "CALOSFRIOS")
	private Integer calosfrios;

	@Column(name = "CEFALEA")
	private Integer cefalea;

	@Column(name = "MIALGIAS")
	private Integer mialgias;

	@Column(name = "ARTRAL")
	private Integer artral;

	@Column(name = "ATAEDOGE")
	private Integer ataedoge;

	@Column(name = "RINORREA")
	private Integer rinorrea;

	@Column(name = "POLIPNEA")
	private Integer polipnea;

	@Column(name = "VOMITO")
	private Integer vomito;

	@Column(name = "DOLABDO")
	private Integer dolabdo;

	@Column(name = "CONJUN")
	private Integer conjun;

	@Column(name = "CIANOSIS")
	private Integer cianosis;

	@Column(name = "INISUBIS")
	private Integer inisubis;

	@Column(name = "ANOSMIA")
	private Integer anosmia;

	@Column(name = "DISGEUSIA")
	private Integer disgeusia;

	@Column(name = "ASINTOMATICO")
	private Integer asintomatico;

	@Column(name = "DIABETES")
	private Integer diabetes;

	@Column(name = "EPOC")
	private Integer epoc;

	@Column(name = "ASMA")
	private Integer asma;

	@Column(name = "INMUNOSUPRIMIDO")
	private Integer inmunosuprimido;

	@Column(name = "HIPERTENSION")
	private Integer hipertension;

	@Column(name = "VIH_SIDA")
	private Integer vih_sida;

	@Column(name = "OTRACONDICION")
	private Integer otracondicion;

	@Column(name = "ENFERMEDADCARDIACA")
	private Integer enfermedadcardiaca;

	@Column(name = "OBESIDAD")
	private Integer obesidad;

	@Column(name = "INSRENCR")
	private Integer insrencr;

	@Column(name = "TABAQUISMO")
	private Integer tabaquismo;

	@Column(name = "RECTRATA")
	private Integer rectrata;

	@Column(name = "TXCROBIA")
	private Integer txcrobia;

	@Column(name = "TXANTIVI")
	private Integer txantivi;

	@Column(name = "ANTIVIR")
	private String antivir;

}
