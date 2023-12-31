package egd.covid.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import egd.covid.persistence.entity.table.Registro;

@Repository
public interface RegistroRepository extends JpaRepository<Registro, Long> {

}
