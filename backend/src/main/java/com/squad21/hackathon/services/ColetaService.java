package com.squad21.hackathon.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.squad21.hackathon.dto.ColetaDTO;
import com.squad21.hackathon.entities.Coleta;
import com.squad21.hackathon.repositories.ColetaRepository;

@Service
public class ColetaService {
	
	@Autowired
	private ColetaRepository repository;
	
	public Page<ColetaDTO> findAllPaged(String cidade, PageRequest pageRequest) {
		if (cidade.isEmpty()) { cidade = null; }
		Page<Coleta> pontosDeColeta = repository.find(cidade, pageRequest);
		return pontosDeColeta.map(pontoDeColeta -> new ColetaDTO(pontoDeColeta));
	}
	
	public ColetaDTO insert(ColetaDTO coletaDTO) {
		Coleta pontoDeColeta = new Coleta();
		pontoDeColeta.setNome(coletaDTO.getNome());
		pontoDeColeta.setImgUrl(coletaDTO.getImgUrl());
		pontoDeColeta.setLogradouro(coletaDTO.getLogradouro());
		pontoDeColeta.setNumero(coletaDTO.getNumero());
		pontoDeColeta.setBairro(coletaDTO.getBairro());
		pontoDeColeta.setComplemento(coletaDTO.getComplemento());
		pontoDeColeta.setCep(coletaDTO.getCep());
		pontoDeColeta.setCidade(coletaDTO.getCidade());
		pontoDeColeta.setEstado(coletaDTO.getEstado());
		
		pontoDeColeta = repository.save(pontoDeColeta);
		
		return new ColetaDTO(pontoDeColeta);
	}

}
