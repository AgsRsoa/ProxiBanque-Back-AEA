package com.example.demo.model;



import java.util.HashSet;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	@Embedded
	private Adresse adresse;
//	
//	@OneToMany(mappedBy = "client",  cascade= CascadeType.PERSIST)
//	private Set<Compte> comptes = new HashSet<Compte>();
	
	//liste de comptes getter/setter ?
	public Client(String nom, String prenom,Adresse adresse){ //Set<Compte> comptes
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
//		this.comptes = comptes;

	}
	

	
	public Client() {
		
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
	
	

//	public Set<Compte> getComptes() {
//		return comptes;
//	}
//
//	public void setComptes(Set<Compte> comptes) {
//		this.comptes = comptes;
//	}
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
