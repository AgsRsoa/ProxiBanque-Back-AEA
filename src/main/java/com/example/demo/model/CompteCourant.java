package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class CompteCourant extends Compte{
	
	
	private double decouvert = -1000;
	

	public CompteCourant() {
	
	}
	public CompteCourant(String numeroDeCompte, double solde) {
		super(numeroDeCompte,solde);
		
	}

	
	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	

	@Override
	public String toString() {
		return "CompteCourant [" + super.toString()+ "decouvert=" + decouvert + "]"; 
	}
	

	
	
	
	

}
