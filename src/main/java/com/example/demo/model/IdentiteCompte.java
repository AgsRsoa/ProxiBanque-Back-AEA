package com.example.demo.model;

import java.time.LocalDate;

import jakarta.persistence.Embeddable;




@Embeddable
public class IdentiteCompte {
	

	
	
	private String numeroDeCompte;
	private double solde;
	private LocalDate dateOuverture;
	
	
	
	public IdentiteCompte(String numeroDeCompte, double solde, LocalDate dateOuverture) {
	
		this.numeroDeCompte = numeroDeCompte;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
	}
	
	public IdentiteCompte() {
		
	}
	
	public String getNumeroDeCompte() {
		return numeroDeCompte;
	}
	public void setNumeroDeCompte(String numeroDeCompte) {
		this.numeroDeCompte = numeroDeCompte;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public LocalDate getDateOuverture() {
		return dateOuverture;
	}

	
	@Override
	public String toString() {
		return "numeroDeCompte="+ numeroDeCompte + ", solde=" + solde + ", dateOuverture=" + dateOuverture
				+ "]";
	}



}





