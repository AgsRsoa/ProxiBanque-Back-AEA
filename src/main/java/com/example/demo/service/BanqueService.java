package com.example.demo.service;

import java.util.Optional;

import com.example.demo.model.Client;

public interface BanqueService {
	
	Optional<Client> getClientById(Long id);

}
