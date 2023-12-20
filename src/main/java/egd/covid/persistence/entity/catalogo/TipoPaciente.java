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
@Table(name = "C_TIPOPACIENTE")
@NoArgsConstructor
public class TipoPaciente implements Serializable {

	private static final long serialVersionUID = -839188957924491831L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDTIPOPACIENTE")
	private Long id;
	
	@Column(name = "TIPOPACIENTE")
	private String tipoPaciente;
	
	public TipoPaciente(String tipoPaciente) {
		this.tipoPaciente = tipoPaciente;
	}

}
