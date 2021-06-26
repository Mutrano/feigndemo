package br.com.mario.feigndemo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PokeAmigo {
	@JsonProperty
	private Integer id;
	@JsonProperty
	private String name;

	public PokeAmigo(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	
}
