package egd.covid.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import egd.covid.persistence.entity.catalogo.Servicio;

@Repository
public interface ServicioRepository extends JpaRepository<Servicio, Integer> {

}
