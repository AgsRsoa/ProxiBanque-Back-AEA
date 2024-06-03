package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.exception.NotFoundException;
import com.example.demo.model.Client;
import com.example.demo.model.Compte;
import com.example.demo.model.CompteCourant;
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
	// TODO AddCompteEpargne

	public List<Compte> getAllCompte() {
		// TODO Auto-generated method stub
		return compteRepository.findAll();
	}
	@Override
	public Optional<Compte> getCompteById(Long id) {
		return compteRepository.findById(id); //  findById()
	}
	
	//Liste des comptes d'1 client : findByClientId >renvoie comptes
	
	//UpdateCompte
	
	//Delete 1 seul type de compte 
	
	
	/*List<Compte> ComptesClient(compte id) 1- 	compteClient = findCompteByClientId(Long id)*/
	
	
	
	
		
}
