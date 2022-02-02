package com.leoncarraro.brewerycadastrocervejaservice.controller;

import java.net.URI;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.leoncarraro.brewerycadastrocervejaservice.service.CervejaService;
import com.leoncarraro.breweryspringbootshared.domain.dto.CervejaDTO;
import com.leoncarraro.breweryspringbootshared.domain.entity.Cerveja;

@RestController(value = "/")
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
@AllArgsConstructor
public class CervejaController {

	private final CervejaService cervejaService;

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Cerveja> create(@RequestBody final CervejaDTO cervejaDTO) {
		long totalCount = System.currentTimeMillis();
		Cerveja cerveja = cervejaService.create(cervejaDTO);
		log.info("Tempo total gasto para validar e salvar cerveja {}: [{}ms]", cervejaDTO.getNome(), System.currentTimeMillis() - totalCount);

		URI uri = ServletUriComponentsBuilder //
				.fromCurrentRequest() //
				.path("/{id}") //
				.buildAndExpand(cerveja.getId()) //
				.toUri();

		return ResponseEntity.created(uri).body(cerveja);
	}

}
