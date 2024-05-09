package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Compte {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String numeroDeCompte;
	private double solde;
	private Date dateOuverture;
	
	@ManyToOne
	@JoinColumn(name="compte_id")
	private Client client;
	
	public Compte(String numeroDeCompte, double solde, Date dateOuverture) {
	
		this.numeroDeCompte = numeroDeCompte;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
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
	public Date getDateOuverture() {
		return dateOuverture;
	}
	@Override
	public String toString() {
		return "Compte [numeroDeCompte=" + numeroDeCompte + ", solde=" + solde + ", dateOuverture=" + dateOuverture
				+ "]";
	}
	
	
}
