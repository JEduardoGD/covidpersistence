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
@Table(name = "C_OCUPACION")
@NoArgsConstructor
public class Ocupacion implements Serializable {

	private static final long serialVersionUID = 7505625593809004727L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDOCUPACION")
	private Long id;

	@Column(name = "OCUPACION")
	private String ocupacion;

	public Ocupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
}
