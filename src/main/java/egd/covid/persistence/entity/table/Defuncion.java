package egd.covid.persistence.entity.table;

import java.io.Serializable;
import java.util.Date;

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
@Table(name = "T_DEFUNCION")
@NoArgsConstructor
public class Defuncion implements Serializable {
	private static final long serialVersionUID = 2168945189481466789L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDDEFUNCION")
	private Long id;

	@Column(name = "FECHA")
	private Date fecha;

	@Column(name = "SEMANA")
	private Long semana;

	@Column(name = "CERTIFICADO")
	private String certificado;

	@Column(name = "VERIFICADO")
	private Character verificado;

	public boolean allFieldsNull() {
		return this.fecha == null && this.semana == null && this.certificado == null && this.verificado == null;
	}
}
