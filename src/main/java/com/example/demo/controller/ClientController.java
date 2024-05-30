package com.example.demo.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.MessageDto;
import com.example.demo.model.Client;
import com.example.demo.model.CompteCourant;
import com.example.demo.model.CompteEpargne;
import com.example.demo.model.IdentiteCompte;
import com.example.demo.service.BankService;


@RestController
//@CrossOrigin(origins="http://localhost:4200")
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
	
	@GetMapping("{id}")
	Optional<Client> oneClient(@PathVariable Long id){
		return service.getClientById(id);
	}
	
	@PostMapping
	public Client postClient(@RequestBody Client client) {

		return service.addClient(client); 
		
	}
	
	@PutMapping({"{id}", ""})
	public Client putClient(@PathVariable(value="id", required=false) Long id, @RequestBody Client client){
		if(id!=null)
			client.setId(id);
		System.out.println("client to update:" + client);
		return service.updateClient(client);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity deleteClient(@PathVariable Long id) {
		 service.deleteClient(id);
		 return new ResponseEntity<>(new MessageDto("Client with id " + id + " deleted"),HttpStatus.OK);
	}
	


}
