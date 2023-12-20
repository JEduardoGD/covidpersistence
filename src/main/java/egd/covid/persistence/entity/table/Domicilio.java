package egd.covid.persistence.entity.table;

import java.io.Serializable;

import egd.covid.persistence.entity.catalogo.Entidad;
import egd.covid.persistence.entity.catalogo.Localidad;
import egd.covid.persistence.entity.catalogo.Municipio;
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
@Table(name = "T_DOMICILIO")
@NoArgsConstructor
public class Domicilio implements Serializable {

	private static final long serialVersionUID = 5371116650668420763L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDDOMICILIO")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="IDLOCALIDAD")
	private Localidad localidad;

	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="IDENTIDAD")
	private Entidad entidad;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="IDMUNICIPIO")
	private Municipio municipioResidencia;
	
	@Column(name = "DOMICILIO")
	private String domicilio;
	
	@Column(name = "CP")
	private String cp;
	
	@Column(name = "TELEFONO")
	private String telefono;
}
