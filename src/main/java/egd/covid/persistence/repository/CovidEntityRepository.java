package egd.covid.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import egd.covid.persistence.entity.CovidEntity;

@Repository
public interface CovidEntityRepository extends JpaRepository<CovidEntity, Long> {
	@Query(value = "SELECT coalesce(max(id), 0) FROM CovidEntity")
	public long getMaxId();
}
