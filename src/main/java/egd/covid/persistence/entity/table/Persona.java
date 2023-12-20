package egd.covid.persistence.entity.table;

import java.io.Serializable;
import java.util.Date;

import egd.covid.persistence.entity.catalogo.Entidad;
import egd.covid.persistence.entity.catalogo.Ocupacion;
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
@Table(name = "T_PERSONA")
@NoArgsConstructor
public class Persona implements Serializable {
	private static final long serialVersionUID = 3139968922833651698L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDPERSONA")
	private Long id;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "PRIMER_APELLIDO")
	private String primerApellido;

	@Column(name = "SEGUNDO_APELLIDO")
	private String segundoApellido;

	@Column(name = "SEXO")
	private Character sexo;

	@Column(name = "CURP")
	private String curp;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDENTIDAD_NACIMIENTO")
	private Entidad entidadNacimiento;

	@Column(name = "FECNACIMIENTO")
	private Date fechaNacimiento;

	@Column(name = "EDAD")
	private Long edad;

	@Column(name = "NACIONALIDAD")
	private Character nacionalidad;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "IDDEFUNCION")
	private Defuncion defuncion;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "IDDOMICILIO")
	private Domicilio domicilio;

	@Column(name = "INDIGENA")
	private Boolean indigena;

	@Column(name = "HABLANTEINDIGENA")
	private Boolean hablanteIndigena;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDOCUPACION")
	private Ocupacion ocupacion;
}
