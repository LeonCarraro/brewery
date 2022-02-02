package com.leoncarraro.brewerycadastrocervejaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = { "com.leoncarraro.breweryspringbootshared.domain.entity" })
public class CadastroCervejaServiceApplication {

	public static void main(final String[] args) {
		SpringApplication.run(CadastroCervejaServiceApplication.class, args);
	}

}
