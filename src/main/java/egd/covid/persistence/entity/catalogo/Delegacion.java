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
@Table(name = "C_DELEGACION")
@NoArgsConstructor
public class Delegacion implements Serializable {
	private static final long serialVersionUID = 4386627828035058338L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDDELEGACION")
	private Long id;

	@Column(name = "DELEGACION")
	private String delegacion;

	public Delegacion(String delegacion) {
		this.delegacion = delegacion;
	}
}
