package egd.covid.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import egd.covid.persistence.entity.catalogo.Municipio;

public interface MunicipioRepository extends JpaRepository<Municipio, Long> {
	Municipio findByMunicipio(String municipio);
}
