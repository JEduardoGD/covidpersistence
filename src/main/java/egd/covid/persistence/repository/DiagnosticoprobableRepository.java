package egd.covid.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import egd.covid.persistence.entity.catalogo.Diagnosticoprobable;

@Repository
public interface DiagnosticoprobableRepository extends JpaRepository<Diagnosticoprobable, Long> {
	
}
