package egd.covid.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import egd.covid.persistence.entity.table.Defuncion;

@Repository
public interface DefuncionRepository extends JpaRepository<Defuncion, Long> {

}
