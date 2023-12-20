package egd.covid.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import egd.covid.persistence.entity.catalogo.Delegacion;

@Repository
public interface DelegacionRepository extends JpaRepository<Delegacion, Long> {
	Delegacion findByDelegacion(String delegacion);
}
