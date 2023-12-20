package egd.covid.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import egd.covid.persistence.entity.table.Registro;

public interface RegistroRepository extends JpaRepository<Registro, Long> {

}
