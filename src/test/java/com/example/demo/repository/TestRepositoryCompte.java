package com.example.demo.repository;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.ProxiBanqueAeaApplication;
import com.example.demo.model.Compte;
import com.example.demo.model.CompteCourant;
import com.example.demo.model.CompteEpargne;

@SpringBootTest(classes= {ProxiBanqueAeaApplication.class})
public class TestRepositoryCompte {
	
	@Autowired
	private CompteRepository compteRepository;
	
	@Test
	public void testfindBySoldeLessThan() {

		
		compteRepository.save(new CompteCourant("C1",-100.0));
		compteRepository.save(new CompteCourant("C2",1000));
		compteRepository.save(new CompteEpargne("C3",-550));
		compteRepository.save(new CompteEpargne("C4",550));

		double solde=0.1;
		List<Compte> comptes = compteRepository.findBySoldeLessThan(solde);
		
		for(Compte c : comptes) {
			assertTrue(c.getSolde()< solde);
		}
		
	}
	

}
