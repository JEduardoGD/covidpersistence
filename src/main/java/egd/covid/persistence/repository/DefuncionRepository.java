package egd.covid.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import egd.covid.persistence.entity.table.Defuncion;

public interface DefuncionRepository extends JpaRepository<Defuncion, Long> {

}
