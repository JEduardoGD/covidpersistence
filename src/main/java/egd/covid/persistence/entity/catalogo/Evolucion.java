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
@Table(name = "C_EVOLUCION")
@NoArgsConstructor
public class Evolucion implements Serializable {
	private static final long serialVersionUID = -4282204099935979209L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDEVOLUCION")
	private Long id;

	
	@Column(name = "EVOLUCION")
	private String evolucion;

}
