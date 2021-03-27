package com.squad21.hackathon.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.squad21.hackathon.dto.EscolaDTO;
import com.squad21.hackathon.entities.Escola;
import com.squad21.hackathon.repositories.EscolaRepository;

@Service
public class EscolaService {
	
	@Autowired
	private EscolaRepository repository;
	
	@Transactional(readOnly = true)
	public List<EscolaDTO> findAll() {
		List<Escola> escolas = repository.findAll();
		return escolas.stream().map(escola -> new EscolaDTO(escola)).collect(Collectors.toList());
	}

}
