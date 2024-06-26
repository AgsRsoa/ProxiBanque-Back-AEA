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
		
		Adresse a4 = new Adresse("Los Angeles","78382","(093) 567-376") ;
		Client c4 = new Client("John","Smith",a4);
		
		service.addClient(c4);
		service.addCompteEpargne(c4.getId(), "C4", 0.0);
		
		Adresse a5 = new Adresse("NYC","43526","444) 567-333");
		Client c5 = new Client("Sam","Wilson",a5);
		
		service.addClient(c5);
		service.addCompteEpargne(c5.getId(), "C5", 1500.0);
	
		Adresse a6 = new Adresse("San Diego","78394","(999)567-376");
		Client c6 = new Client("Barbara","Oreilly",a6);
		
		service.addClient(c6);
		service.addCompteCourant(c6.getId(), "C6", -500.0);
		
		//Client avec 2 types de compte
		
		Adresse a7 = new Adresse("Palo Alto","77777","(999)567-376");
		Client c7 = new Client("Tom","DoubleComptes",a7);
		
		service.addClient(c7);
		service.addCompteCourant(c7.getId(),"CC7",0.0); 
		service.addCompteEpargne(c7.getId(), "CE7", 5000.0);
		
		Adresse a8 = new Adresse("Denver","88888","(999)1010-376");
		Client c8 = new Client("Paul","OCalaghan",a8);
		
		service.addClient(c8);
		service.addCompteCourant(c8.getId(), "C8", -600.0);
		
		Adresse a9 = new Adresse("Houston","88888","(999)1010-376");
		Client c9 = new Client("Kelly","OCalaghan",a9);
		
		service.addClient(c9);
		service.addCompteCourant(c9.getId(), "C9", -850.0);
	
} 
	
}
