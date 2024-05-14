package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Client;
import com.example.demo.repository.ClientRepository;

public class BanqueServiceImpl implements BanqueService {

	private ClientRepository clientRepository;
	
	public BanqueServiceImpl(ClientRepository clientrepo) {
		clientRepository = clientrepo;
		
	}
	@Override
	public Optional<Client> getClientById(Long id) {
	
		return clientRepository.findById(id);
				
	}
	@Override
	public List<Client> getAllClients() {
	
		return clientRepository.findAll();
	}

}
