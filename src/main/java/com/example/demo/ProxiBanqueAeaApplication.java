package com.example.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Adresse;
import com.example.demo.model.Client;
import com.example.demo.model.Compte;
import com.example.demo.model.CompteCourant;
import com.example.demo.model.CompteEpargne;

@SpringBootApplication
public class ProxiBanqueAeaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProxiBanqueAeaApplication.class, args);
		//Créer des nouveaux clients
		Adresse a = new Adresse("ville", "473829","012234");
		LocalDate date = LocalDate.now();
		CompteCourant cc = new CompteCourant("1234", date, 500, "courant");
		CompteEpargne ce = new CompteEpargne("1234", date, 500, "courant");
		List<Compte> comptes = new ArrayList<Compte>();
		comptes.add(cc);
		comptes.add(ce);
		Client c = new Client("nom","prenom",a,comptes);
		System.out.println(c);
		//Créer des nouveaux comptes des 2 types
		//Tester opérations crédit et débit
	}

}
