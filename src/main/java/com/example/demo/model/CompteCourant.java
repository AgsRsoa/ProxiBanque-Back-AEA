package com.example.demo.model;

import java.util.Date;

public class CompteCourant extends Compte {
	
	private double decouvert = -1000;
	private String typeCompte = "courant";

	public CompteCourant(String numeroDeCompte, Date dateOuverture, double solde,String typeCompte) {
		super(numeroDeCompte,solde, dateOuverture);
		this.typeCompte = typeCompte;
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	
	

}
