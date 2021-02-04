package com.devsuperior.crudrest.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.crudrest.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client>list = new ArrayList<>();
		list.add(new Client(1L, "Aline", "453.272.158-06", 200.00, null, null));
		list.add(new Client(1L, "Lucas", "453.272.158-06", 200.00, null, null));
		return ResponseEntity.ok().body(list);
	}
}
