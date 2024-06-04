package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class CompteEpargne extends Compte  {


	private Double tauxDeRemuneration= 0.03;
	
	
	public CompteEpargne() {
	
	}
	
	public CompteEpargne(String numeroDeCompte, double solde) {
		super(numeroDeCompte,solde);
		
	}

	public Double getTauxDeRemuneration() {
		return tauxDeRemuneration;
	}

	public void setTauxDeRemuneration(Double tauxDeRemuneration) {
		this.tauxDeRemuneration = tauxDeRemuneration;
	}


	@Override
	public String toString() {
		return "CompteEpargne ["+ super.toString()+ "tauxDeRemuneration=" + tauxDeRemuneration + "]"; 
	}


	


	
	
}
