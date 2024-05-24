package com.example.demo.model;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;


public class CompteEpargne  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Embedded
	private IdentiteCompte infos;
	private String typeCompte = "epargne";
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@MapsId
	private Client client;

	public CompteEpargne( IdentiteCompte infos) {
		this.infos = infos;
	
	}

	public String getTypeCompte() {
		return typeCompte;
	}

	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}

	
	@Override
	public String toString() {
		return  "CompteEpargne [" + "NumeroDeCompte="+ infos.getNumeroDeCompte()+"Solde=" +infos.getSolde() +"Date Ouverture" +infos.getDateOuverture()  + "TypeCompte=" + typeCompte + "]";
	}

	
	
}
