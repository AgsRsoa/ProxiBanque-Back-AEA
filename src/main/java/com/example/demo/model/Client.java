package com.example.demo.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	@Embedded
	private Adresse adresse;
	@OneToOne(cascade = {CascadeType.PERSIST})
	private Compte compte;
	
	//liste de comptes getter/setter ?
	public Client(String nom, String prenom,Adresse adresse, Compte compte){ 
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.compte = compte;

	}
	

	
	public Client() {
		
	}
	
	
	public Long getId() {
		return id;
	}



	public String getNom() {
		return nom;
	}
//	public void setNom(String nom) {
//		this.nom = nom;
//	}
	public String getPrenom() {
		return prenom;
	}
//	public void setPrenom(String prenom) {
//		this.prenom = prenom;
//	}


	public Adresse getAdresse() {
		return adresse;
	}



	public Compte getCompte() {
		return compte;
	}
	

//
//	public void setAdresse(Adresse adresse) {
//		this.adresse = adresse;
//	}
	
	
//
//// + id +
//	@Override
//	public String toString() {
//		return "Client [id="+ ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", comptes="
//				+ comptes + "]";
//	}


	
	

}
