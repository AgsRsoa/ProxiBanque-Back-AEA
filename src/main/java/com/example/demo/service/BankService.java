package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Client;

public interface BankService {

	Optional<Client> getClientById(Long id);
	List<Client> getAllClients();
	Client addClient(Client client);
	void deleteClient(Long id);
	Optional<Client> updateClient(Long id, Client client);
}
