package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Client;
import com.example.demo.repository.ClientRepository;

@Service
public class BankServiceImpl implements BankService {

	private ClientRepository clientRepository;
	
	
	public BankServiceImpl(ClientRepository clientRepository) {
		//super();
		this.clientRepository = clientRepository;
	}
	@Override
	public Optional<Client> getClientById(Long id) {
	
		return clientRepository.findById(id);
				
	}
	@Override
	public List<Client> getAllClients() {
	
		return clientRepository.findAll();
	}
	@Override
	public Client addClient(Client client) {
		
		return clientRepository.save(client);
	}
	@Override
	public void deleteClient(Long id) {
		//if solde === 0
		 clientRepository.deleteById(id);
		
	}
	@Override
	public Optional<Client> updateClient(Long id, Client client) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
}
