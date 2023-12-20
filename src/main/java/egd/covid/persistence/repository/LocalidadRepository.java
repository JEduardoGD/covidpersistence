package egd.covid.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import egd.covid.persistence.entity.catalogo.Localidad;

@Repository
public interface LocalidadRepository extends JpaRepository<Localidad, Long> {
	Localidad findByLocalidad(String localidad);
}
