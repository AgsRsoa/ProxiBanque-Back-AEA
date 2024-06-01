package com.example.demo;

import java.time.LocalDate;



import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Adresse;
import com.example.demo.model.Client;
import com.example.demo.model.CompteCourant;
import com.example.demo.model.CompteEpargne;
import com.example.demo.model.IdentiteCompte;

@SpringBootApplication
public class ProxiBanqueAeaApplication {
	


	public static void main(String[] args) {
		SpringApplication.run(ProxiBanqueAeaApplication.class, args);
//		//Créer des nouveaux clients
//		//Créer des nouveaux comptes des 2 types
//		Adresse a = new Adresse("ville", "473829","012234");
//		IdentiteCompte infos = new IdentiteCompte("1234",200.0);
//		CompteCourant cc = new CompteCourant(infos); //String,Localdate,int,String
//		
//		Client client = new Client("nom","prenom",a,cc);
//		client.setCompteCourant(cc);
////		CompteEpargne ce = new CompteEpargne("12345", date, 500, "epargne");
//
//
//		System.out.println(client);
//		//Tester opérations crédit et débit
	}

}
