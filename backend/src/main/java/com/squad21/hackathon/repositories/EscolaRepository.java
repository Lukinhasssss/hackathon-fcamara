package com.squad21.hackathon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.squad21.hackathon.entities.Escola;

public interface EscolaRepository extends JpaRepository<Escola, Long> {

}
