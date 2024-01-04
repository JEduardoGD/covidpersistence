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
@Table(name = "C_SERVICIO")
@NoArgsConstructor
public class Servicio implements Serializable{

	private static final long serialVersionUID = 1757569553679415130L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDSERVICIO")
	private Long id;

	@Column(name = "SERVICIO")
	private String servicio;

}
