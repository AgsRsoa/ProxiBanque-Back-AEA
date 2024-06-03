package com.example.demo.service;

import java.util.List;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.exception.BankException;
import com.example.demo.exception.NotFoundException;
import com.example.demo.model.Client;
import com.example.demo.repository.ClientRepository;

//import com.example.demo.exception.NotFoundException;

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
	public Client updateClient(Client client) {
		
		return clientRepository.save(client);
		
	}
	@Override
	public void deleteClient(Long id) //throws NotFoundException
	{
//		if(!clientRepository.existsById(id))
//			throw new NotFoundException("account not found with id=" +id); 
//	if(	clientRepository.findById(id).get().getCompteCourant().getInfos().getSolde() == 0.0) {
//		
//		clientRepository.deleteById(id);
//	}else throw new BankException("Pas de suppression possible car le compte a un solde positif ou négatif" +clientRepository.findById(id).get().getCompteCourant().getInfos().getSolde() );
//		
//		
//		if(!clientRepository.existsById(id))
//			throw new NotFoundException("account not found with id=" +id); 
//		if(	clientRepository.findById(id).get().getCompteCourant().getSolde()==0.0 || clientRepository.findById(id).get().getCompteEpargne().getSolde() == 0.0 ) {
//			clientRepository.deleteById(id);
//	}else throw new BankException("Pas de suppression possible car le compte a un solde positif ou négatif");
		clientRepository.deleteById(id);
		
}
	//Liste des comptes getAllComptes() => findAll()
	//Affichage d'1 compte getCompteById() => findById()
	//@Component avec de comptes pour peupler
	//Liste des comptes d'1 client : findByClientId >renvoie comptes
	//AddCompteCourant trouver le client, cc = new CompteCourant + cc.set (client et attributs), comptesRepository.save(cc) //numero de client id sur front
	//AddCompteEpargne
	//UpdateCompte
	//Delete 1 seul type de compte 
	
	
	/*List<Compte> ComptesClient(compte id) 1- 	compteClient = findCompteByClientId(Long id)*/
	
	
	
	
		
}
