package egd.covid.persistence.entity.table;

import java.io.Serializable;
import java.util.Date;

import egd.covid.persistence.entity.catalogo.Delegacion;
import egd.covid.persistence.entity.catalogo.Diagnosticoprobable;
import egd.covid.persistence.entity.catalogo.Entidad;
import egd.covid.persistence.entity.catalogo.Evolucion;
import egd.covid.persistence.entity.catalogo.Medico;
import egd.covid.persistence.entity.catalogo.Servicio;
import egd.covid.persistence.entity.catalogo.TipoPaciente;
import egd.covid.persistence.entity.catalogo.Unidad;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "T_REGISTRO")
@NoArgsConstructor
public class Registro implements Serializable {

	private static final long serialVersionUID = -829010615527422399L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDREGISTRO")
	private Long id;
	
	@Column(name = "ID_REGISTRO")
	private Long idRegistro;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDENTIDAD")
	private Entidad entidad;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDDELEGACION")		
	private Delegacion delegacion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDUNIDAD")
	private Unidad unidad;
	
	@Column(name = "FOLIO_SINAVE")
	private String folioSinave;
	
	@Column(name = "FOLIO_IMSS")
	private String folioImss;
	
	@Column(name = "FECHAREGISTRO")
	private Date fechaRegistro;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "IDPERSONA")
	private Persona persona;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDTIPOPACIENTE")
	private TipoPaciente tipoPaciente;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDEVOLUCION")
	private Evolucion evolucion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDSERVICIO")
	private Servicio servicio;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDDIAGNOSTICOPROBABLE")
	private Diagnosticoprobable diagnosticoprobable;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "IDMEDICO")
	private Medico medico;
}
