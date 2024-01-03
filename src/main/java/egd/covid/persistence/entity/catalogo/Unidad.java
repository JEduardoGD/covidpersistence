package egd.covid.persistence.entity.catalogo;

import java.io.Serializable;

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
@Table(name = "C_UNIDAD")
@NoArgsConstructor
public class Unidad implements Serializable {

	private static final long serialVersionUID = 6647301125121651174L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDUNIDAD")
	private Long id;
	
	@Column(name = "UNIDAD")
	private String unidad;
	
	@Column(name = "CLAVE")
	private String clave;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDENTIDAD")
	private Entidad entidad;

}
