package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Client;
import com.example.demo.model.Compte;
import com.example.demo.model.CompteCourant;

public interface BankService {

	Optional<Client> getClientById(Long id);
	
	List<Client> getAllClients();
	
	Client addClient(Client client);
	
	Client updateClient(Client client);
	
	void deleteClient(Long id);
	
    Optional<Compte> getCompteById(Long id);
	
	List<Compte> getAllCompte();
	
	CompteCourant addCompteCourant(Long clientId,String numeroDeCompte, double solde);
	
}
