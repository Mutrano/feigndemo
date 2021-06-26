package br.com.mario.feigndemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PegaPokeAmigo {
	private PokeClient client;

	public PegaPokeAmigo(PokeClient client) {
		this.client = client;
	}
	
	@GetMapping("/pokeamigo")
	public ResponseEntity<PokeAmigo> pegaAmigo(){
		return ResponseEntity.ok().body(client.buscaDitto());
	}

}
