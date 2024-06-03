package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Compte;
import com.example.demo.service.BankServiceImpl;

@RestController
//@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/comptes")
public class CompteController {
	
	private BankServiceImpl service;
	
	public CompteController(BankServiceImpl service) {
		this.service = service;
	}
	
	@GetMapping()
	public List<Compte> allComptes(){
		return service.getAllCompte();
	}
	
	@GetMapping("{id}")
	public Optional<Compte> getOneCompte(@PathVariable Long id) {
		return service.getCompteById(id);
	}

}
