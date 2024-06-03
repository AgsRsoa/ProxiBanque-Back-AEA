package com.example.demo.init;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired; import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.example.demo.model.Adresse;
import com.example.demo.model.Client;
import com.example.demo.service.BankServiceImpl;



@Profile("initDataSet")
@Component
public class InitDataSet {
	
	
	@Autowired
	private BankServiceImpl service;


	@PostConstruct
	public void initDefaultDataSet() {
		
		Adresse a1 = new Adresse("Greenfield","07040","(973) 555-3456") ;
		Client c1 = new Client("Jessica","Davis",a1);
			
		service.addClient(c1);
		service.addCompteCourant(c1.getId(),"C1",0.0); 
		
		Adresse a2 = new Adresse("Springfield","07860","(093) 567-3456") ;
		Client c2 = new Client("Emily","Brown",a2);
			
		service.addClient(c2);
		service.addCompteCourant(c2.getId(),"C2",1000.0); 
		
		Adresse a3 = new Adresse("Greenfield","78384","(444) 567-376") ;
		Client c3 = new Client("Molly","Jackson",a3);
			
		service.addClient(c3);
		service.addCompteCourant(c3.getId(),"C3",-200.0); 
		
		//service.addCompteEpargne(new Compte(null,"compteB",150.0));
} 
	
}
