package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Fábio Souza");
		cliente1.setTelefone("91 99999-9999");
		cliente1.setEmail("fabio@email.com");
		
		Cliente cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Deyvid Andrade");
		cliente2.setTelefone("91 99999-9999");
		cliente2.setEmail("deyvid@email.com");
		
		return Arrays.asList(cliente1, cliente2);
	}

}
