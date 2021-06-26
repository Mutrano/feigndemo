package br.com.mario.feigndemo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "poke",url="https://pokeapi.co/api/v2/pokemon/ditto")
public interface PokeClient{

	@GetMapping
	public PokeAmigo  buscaDitto();
}
