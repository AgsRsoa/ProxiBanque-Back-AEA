package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Client;
import com.example.demo.model.Compte;
import com.example.demo.model.CompteCourant;
import com.example.demo.model.CompteEpargne;

public interface BankService {

	Optional<Client> getClientById(Long id);
	
	List<Client> getAllClients();
	
	Client addClient(Client client);
	
	Client updateClient(Client client);
	
	void deleteClient(Long id);
	
    Optional<Compte> getCompteById(Long id);
	
	List<Compte> getAllCompte();
	
	CompteCourant addCompteCourant(Long clientId,String numeroDeCompte, double solde);
	
	CompteEpargne addCompteEpargne(Long clientId,String numeroDeCompte, double solde);
	
	void deleteCompte(Long compteId); 
	List<Compte> findByClientId(Long clientId);
	
}
