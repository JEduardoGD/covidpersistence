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
@Table(name = "C_MUNICIPIO")
@NoArgsConstructor
public class Municipio implements Serializable {
	private static final long serialVersionUID = 610781186990120776L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDMUNICIPIO")
	private Long id;

	@Column(name = "CLAVE")
	private Long clave;

	@Column(name = "MUNICIPIO")
	private String municipio;

	public Municipio(String municipio) {
		this.municipio = municipio;
	}
}
