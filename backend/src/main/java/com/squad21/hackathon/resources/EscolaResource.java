package com.squad21.hackathon.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.squad21.hackathon.dto.EscolaDTO;
import com.squad21.hackathon.services.EscolaService;

@RestController
@RequestMapping(value = "/escolas")
public class EscolaResource {
	
	@Autowired
	private EscolaService service;
	
	@GetMapping
	public ResponseEntity<List<EscolaDTO>> findAll() {
		List<EscolaDTO> escolasDTO = service.findAll();
		return ResponseEntity.ok().body(escolasDTO);
	}

}
