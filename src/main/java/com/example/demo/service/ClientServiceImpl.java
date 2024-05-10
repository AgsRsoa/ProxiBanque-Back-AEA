package com.example.demo.service;

import java.util.Optional;

import com.example.demo.model.Client;
import com.example.demo.repository.ClientRepository;

public class ClientServiceImpl implements ClientService {

	private ClientRepository clientRepository;
	
	public ClientServiceImpl(ClientRepository clientrepo) {
		clientRepository = clientrepo;
		
	}
	@Override
	public Optional<Client> getClientById(Long id) {
	
		return clientRepository.findById(id);
				
	}

}
