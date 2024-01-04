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
@Table(name = "C_DIAGNOSTICOPROBABLE")
@NoArgsConstructor
public class Diagnosticoprobable implements Serializable {
	private static final long serialVersionUID = 7410432581433583661L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDDIAGNOSTICOPROBABLE")
	private Long id;

	@Column(name = "DIAGNOSTICOPROBABLE")
	private String diagnostico;
}
