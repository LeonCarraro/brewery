package com.leoncarraro.breweryspringbootshared.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.leoncarraro.breweryspringbootshared.constant.DatabaseSchemaConstant;
import com.leoncarraro.breweryspringbootshared.constant.DatabaseTableConstant;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(schema = DatabaseSchemaConstant.CORE, name = DatabaseTableConstant.CERVEJA)
@Entity
public class Cerveja {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false, unique = true)
	private Long id;

	@Column(name = "NOME", length = 200, nullable = false)
	private String nome;

}
