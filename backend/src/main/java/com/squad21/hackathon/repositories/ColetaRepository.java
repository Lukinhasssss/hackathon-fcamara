package com.squad21.hackathon.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.squad21.hackathon.entities.Coleta;

public interface ColetaRepository extends JpaRepository<Coleta, Long> {
	
	@Query("SELECT obj FROM Coleta obj WHERE (LOWER(:cidade) LIKE LOWER(CONCAT('%',obj.cidade,'%')))")
	Page<Coleta> find(List<Coleta> cidade, Pageable pageable);

}
