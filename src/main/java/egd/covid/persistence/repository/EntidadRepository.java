package egd.covid.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import egd.covid.persistence.entity.catalogo.Entidad;

@Repository
public interface EntidadRepository extends JpaRepository<Entidad, Long> {
	Entidad findByDescripcion(String descripcion);
}
