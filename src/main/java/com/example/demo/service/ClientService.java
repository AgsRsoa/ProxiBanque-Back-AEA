package com.example.demo.service;

import java.util.Optional;

import com.example.demo.model.Client;

public interface ClientService {
	
	Optional<Client> getClientById();

}
