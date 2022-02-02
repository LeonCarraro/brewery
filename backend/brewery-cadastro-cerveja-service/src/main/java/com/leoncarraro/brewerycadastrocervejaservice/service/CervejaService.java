package com.leoncarraro.brewerycadastrocervejaservice.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

import com.leoncarraro.brewerycadastrocervejaservice.repository.CervejaRepository;
import com.leoncarraro.breweryspringbootshared.domain.dto.CervejaDTO;
import com.leoncarraro.breweryspringbootshared.domain.entity.Cerveja;

@Service
@Slf4j
@AllArgsConstructor
public class CervejaService {

	private final CervejaRepository cervejaRepository;

	public Cerveja create(final CervejaDTO cervejaDTO) {
		log.info("Cerveja: {}", cervejaDTO.getNome());

		Cerveja cerveja = Cerveja.builder() //
				.nome(cervejaDTO.getNome()) //
				.build();

		long insertCount = System.currentTimeMillis();
		cerveja = cervejaRepository.save(cerveja);
		log.info("Tempo gasto para salvar cerveja: [{}ms]", System.currentTimeMillis() - insertCount);

		return cerveja;
	}

}
