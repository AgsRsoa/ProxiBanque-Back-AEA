package com.example.demo.model;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) 
public class Compte {
	
	//méthodes créditer et débiter
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@OneToOne(mappedBy="compteCourant",cascade=CascadeType.PERSIST)
	private Client client;

	private String numeroDeCompte;
	private double solde;
	private LocalDate dateOuverture = LocalDate.now() ;
	
	
	
	public Compte() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Compte(String numeroDeCompte, double solde) {
	
		this.numeroDeCompte = numeroDeCompte;
		this.solde = solde;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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

	public void setDateOuverture(LocalDate dateOuverture) {
		this.dateOuverture = dateOuverture;
	}
	
	@Override
	public String toString() {
		return "numeroDeCompte="+ numeroDeCompte + ", solde=" + solde + ", dateOuverture=" + dateOuverture
				+ "]";
	

}
}
