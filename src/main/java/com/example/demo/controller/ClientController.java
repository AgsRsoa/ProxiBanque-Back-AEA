package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Client;
import com.example.demo.service.BankService;


@RestController
//@CrossOrigin(origins="http://localhost:4200")
//@CrossOrigin(origins ="http://localhost:4200", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("clients")
public class ClientController {
	
	private BankService service;

	public ClientController(BankService service) {
		//super();
		this.service = service;
	}
	
	@GetMapping
	List<Client> allClients(){
		return service.getAllClients();
	}
	
	@PostMapping
	public Client postClient(@RequestBody Client client) {
		
		return service.addClient(client); 
		
	}

}
