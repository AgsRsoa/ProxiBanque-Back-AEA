package com.example.demo.controller;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Client;
import com.example.demo.service.BanqueService;

@RestController
@RequestMapping("clients")
public class ClientController {
	
	private BanqueService service;

	public ClientController(BanqueService service) {
		//super();
		this.service = service;
	}
	
	@GetMapping
	List<Client> allClients(){
		return service.getAllClients();
	}
	

}
