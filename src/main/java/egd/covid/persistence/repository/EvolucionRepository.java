package egd.covid.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import egd.covid.persistence.entity.catalogo.Evolucion;

@Repository
public interface EvolucionRepository extends JpaRepository<Evolucion, Integer> {

}
