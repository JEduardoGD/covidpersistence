package egd.covid.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import egd.covid.persistence.entity.catalogo.Unidad;

public interface UnidadRepository extends JpaRepository<Unidad, Long> {

}
