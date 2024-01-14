package egd.covid.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import egd.covid.persistence.entity.CovidEntity;

@Repository
public interface CovidEntityRepository extends JpaRepository<CovidEntity, Long> {
	@Query(value = "SELECT coalesce(max(id), 0) FROM CovidEntity")
	public long getMaxId();
	
	@Query(value = "SELECT c FROM CovidEntity c WHERE c.id BETWEEN :from AND :to")
	public List<CovidEntity> getBetween(@Param("from")long idFrom, @Param("to")long idTo);
}
