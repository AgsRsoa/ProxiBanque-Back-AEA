package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	//URL => /comptes?typeCompte=courant&idClient=5/6
	@PostMapping("")
	public Compte addCompte(@RequestBody Compte compte, @RequestParam(value="typeCompte",required=false) String typeCompte,@RequestParam(value="idClient") Long idClient) {//a voir si type de compte est dans l'objet compte renvoyé par Angular
		
		if(typeCompte == null || typeCompte.equalsIgnoreCase("courant")) {
			return 	service.addCompteCourant(idClient, compte.getNumeroDeCompte(), compte.getSolde());
		}else {
			return service.addCompteEpargne(idClient, compte.getNumeroDeCompte(), compte.getSolde());
		}

	}
	
	@DeleteMapping("{id}")
	public void deleteCompte(@PathVariable("id") Long id) {
		service.deleteCompte(id);
	}
	
	@GetMapping("/client/{id}")
	public List<Compte> comptesClient(@PathVariable("id") Long id){
		return service.findByClientId(id);
	}
	
	//http://localhost:8080/comptes/decouvert?solde=-0.1
	@GetMapping("decouvert")
	public List<Compte> comptesADecouvert(@RequestParam(value="solde",required=false) Double solde){
		if(solde==null) {
			return service.getAllCompte();
		}
		return service.comptesADecouvert(solde);
	}

}
