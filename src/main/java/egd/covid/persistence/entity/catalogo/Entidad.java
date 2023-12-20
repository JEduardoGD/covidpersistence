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
@Table(name = "C_ENTIDAD")
@NoArgsConstructor
public class Entidad implements Serializable {
	
	private static final long serialVersionUID = 7125217157860070630L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDENTIDAD")
	private Long id;
	
	@Column(name = "CLAVE")
	private Long clave;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;
	
	public Entidad(String descripcion) {
		this.descripcion = descripcion;
	}
}
