package egd.covid.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import egd.covid.persistence.entity.catalogo.Ocupacion;

@Repository
public interface OcupacionRepository extends JpaRepository<Ocupacion, Long> {

}
