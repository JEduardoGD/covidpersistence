package egd.covid.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import egd.covid.persistence.entity.table.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
	@Query(value = "SELECT p FROM Persona p WHERE p.nombre = :nombre AND p.primerApellido = :primerApellido")
	public List<Persona> findByParameters(@Param("nombre") String nombre,
			@Param("primerApellido") String primerApellido);
}
