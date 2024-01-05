package egd.covid.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import egd.covid.persistence.entity.catalogo.Municipio;

@Repository
public interface MunicipioRepository extends JpaRepository<Municipio, Long> {
	Municipio findByMunicipio(String municipio);
}
