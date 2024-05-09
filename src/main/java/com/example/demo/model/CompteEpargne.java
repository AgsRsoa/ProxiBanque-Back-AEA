package com.example.demo.model;

import java.util.Date;

public class CompteEpargne extends Compte {

	
	private String typeCompte = "epargne";

	public CompteEpargne(String numeroDeCompte, Date dateOuverture, double solde,String typeCompte) {
		super(numeroDeCompte,solde, dateOuverture);
		this.typeCompte = typeCompte;
	}

	public String getTypeCompte() {
		return typeCompte;
	}

	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}

	
}
