package egd.covid.persistence.entity.catalogo;

import java.io.Serializable;
import java.math.BigDecimal;

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
@Table(name = "C_LOCALIDAD")
@NoArgsConstructor
public class Localidad implements Serializable {

	private static final long serialVersionUID = -8109883871891225208L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDLOCALIDAD")
	private Long id;

	@Column(name = "CLAVE")
	private Long clave;

	@Column(name = "LOCALIDAD")
	private String localidad;

	@Column(name = "LATITUD")
	private BigDecimal latitud;

	@Column(name = "LONGITUD")
	private BigDecimal longitud;
}
