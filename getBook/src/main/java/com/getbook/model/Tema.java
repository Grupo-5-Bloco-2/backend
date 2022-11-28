package com.getbook.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table (name = "tb_tema")
public class Tema {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull (message = "O Atributo id e obrigatorio")
	private Long id;
	
	@NotBlank
	@Size(min = 1, max = 100, message = "O Atributo titulo deve conter no minimo 5 e no maximo 100")
	private String genero; // tipo do texto, poesia lieterari...
	
	@NotBlank
	@Size(min = 1, max = 100, message = "O Atributo titulo deve conter no minimo 5 e no maximo 100")
	private String categoria; // categoria seria romance cientifico 
	//private String

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	
}
