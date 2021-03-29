package com.squad21.hackathon.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.squad21.hackathon.dto.ColetaDTO;
import com.squad21.hackathon.services.ColetaService;

@RestController
@RequestMapping(value = "/pontosdecoleta")
public class ColetaResource {
	
	@Autowired
	private ColetaService service;
	
	@GetMapping
	public ResponseEntity<Page<ColetaDTO>> findAll(
			@RequestParam(value = "cidade", defaultValue = "") String cidade,
			@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "linesPerPage", defaultValue = "12") Integer linesPerPage,
			@RequestParam(value = "direction", defaultValue = "ASC") String direction,
			@RequestParam(value = "orderBy", defaultValue = "nome") String orderBy
			) {
		
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		
		Page<ColetaDTO> pontosDeColeta = service.findAllPaged(cidade.trim(), pageRequest);
		
		return ResponseEntity.ok().body(pontosDeColeta);
		
	}
	
	@PostMapping
	public ResponseEntity<ColetaDTO> insert(@RequestBody ColetaDTO coletaDTO) {
		coletaDTO = service.insert(coletaDTO);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(coletaDTO.getId()).toUri();
		return ResponseEntity.created(uri).body(coletaDTO);
	}

}
