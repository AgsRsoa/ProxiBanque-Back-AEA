package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Client;

public interface BanqueService {
	
	Optional<Client> getClientById(Long id);
	List<Client> getAllClients();

}
