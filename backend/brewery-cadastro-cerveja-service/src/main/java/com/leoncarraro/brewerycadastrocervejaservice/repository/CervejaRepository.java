package com.leoncarraro.brewerycadastrocervejaservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leoncarraro.breweryspringbootshared.domain.entity.Cerveja;

@Repository
public interface CervejaRepository extends JpaRepository<Cerveja, Long> {}
