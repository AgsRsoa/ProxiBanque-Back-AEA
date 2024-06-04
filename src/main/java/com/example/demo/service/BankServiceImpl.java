package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.exception.BankException;
import com.example.demo.exception.NotFoundException;
import com.example.demo.model.Client;
import com.example.demo.model.Compte;
import com.example.demo.model.CompteCourant;
import com.example.demo.model.CompteEpargne;
import com.example.demo.repository.ClientRepository;
import com.example.demo.repository.CompteRepository;

import jakarta.transaction.Transactional;



@Service
@Transactional
public class BankServiceImpl implements BankService {

	
	private ClientRepository clientRepository;
	
	private CompteRepository compteRepository;
	
	public BankServiceImpl(ClientRepository clientRepository,CompteRepository compteRepository) {
		//super();
		this.clientRepository = clientRepository;
		this.compteRepository = compteRepository ;
	}
	
	
	//CLIENTS
	
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
	public Client updateClient(Client client) {
		
		return clientRepository.save(client);
		
	}
	@Override
	public void deleteClient(Long id) { //throws NotFoundException 

		clientRepository.deleteById(id);
		
}
	
	//COMPTES

	public List<Compte> getAllCompte() {
		// TODO Auto-generated method stub
		return compteRepository.findAll();
	}
	@Override
	public Optional<Compte> getCompteById(Long id) {
		return compteRepository.findById(id); 
	}

	
	//Liste des comptes d'1 client 
	@Override
	public List<Compte> findByClientId(Long clientId) {
		return compteRepository.findByClientId(clientId);  // A TESTER
	}
	
	
	public List<Compte> comptesADecouvert(double solde){
		return compteRepository.findBySoldeLessThan(solde);
		
	}
	
	public CompteCourant addCompteCourant(Long clientId,String numeroDeCompte, double solde) {
		
		Optional<Client> optionalClient  = clientRepository.findById(clientId);
		
		if(optionalClient.isEmpty()) {
			throw new NotFoundException("Client avec l'id " +clientId+" non trouvé");
		}
			
		CompteCourant compteCourant = new CompteCourant();
		compteCourant.setNumeroDeCompte(numeroDeCompte);
		compteCourant.setSolde(solde);
		compteCourant.setClient(optionalClient.get()); 
	
		
	
		return compteRepository.save(compteCourant);
	}
	
	

	

	@Override
	public CompteEpargne addCompteEpargne(Long clientId,String numeroDeCompte, double solde) {
		
		Optional<Client> optionalClient  = clientRepository.findById(clientId);
		
		if(optionalClient.isEmpty()) {
			throw new NotFoundException("Client avec l'id " +clientId+" non trouvé");
		}
			
		CompteEpargne compteEpargne = new CompteEpargne();
		compteEpargne.setNumeroDeCompte(numeroDeCompte);
		compteEpargne.setSolde(solde);
		compteEpargne.setClient(optionalClient.get()); 
	
		
	
		return compteRepository.save(compteEpargne);
		
	}
	

	
	//Delete 1 seul type de compte 
	
	@Override
	public void deleteCompte(Long compteId) {
		Optional<Compte> optionalCompte = compteRepository.findById(compteId);
		if (optionalCompte.isPresent() && optionalCompte.get().getSolde() > -0.1 && optionalCompte.get().getSolde() < 0.1) {
			compteRepository.deleteById(compteId);
		} else if(optionalCompte.isEmpty()) {
			throw new NotFoundException("COMPTE AVEC L'ID " + compteId +"INEXISTANT.");
		}
		else if(optionalCompte.get().getSolde() > -0.1) {
			throw new BankException("SUPPRESSION IMPOSSIBLE.CE COMPTE POSSEDE UN SOLDE POSITIF.");
		}
		else if(optionalCompte.get().getSolde() < 0.1) {
			throw new BankException("SUPPRESSION IMPOSSIBLE.CE COMPTE POSSEDE UN SOLDE NEGATIF.");
		}
		
	}

	
		
}
