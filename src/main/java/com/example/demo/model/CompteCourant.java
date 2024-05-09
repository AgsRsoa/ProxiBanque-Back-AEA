package com.example.demo.model;

import java.time.LocalDate;


public class CompteCourant extends Compte {
	
	private double decouvert = -1000;
	private String typeCompte = "courant";

	public CompteCourant(String numeroDeCompte, LocalDate dateOuverture, double solde,String typeCompte) {
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
