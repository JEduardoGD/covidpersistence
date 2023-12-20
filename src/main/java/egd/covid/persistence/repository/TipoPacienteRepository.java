package egd.covid.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import egd.covid.persistence.entity.catalogo.Delegacion;
import egd.covid.persistence.entity.catalogo.TipoPaciente;

@Repository
public interface TipoPacienteRepository  extends JpaRepository<TipoPaciente, Long> {
	Delegacion findByTipoPaciente(String tipoPaciente);
}
