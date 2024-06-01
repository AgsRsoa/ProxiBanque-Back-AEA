package com.example.demo.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="compte_courant_id")
	private CompteCourant compteCourant;
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="compte_epargne_id")
	private CompteEpargne compteEpargne;
	

	public Client(String nom, String prenom,Adresse adresse, CompteCourant compteCourant){  //,CompteEpargne compteEpargne
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.compteCourant = compteCourant;
		this.compteEpargne = compteEpargne;
	}
	

	
	public Client() {
		
	}
	
	
	public Long getId() {
		return id;
	}
	
	



	public void setId(Long id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}



	public CompteCourant getCompteCourant() {
		return compteCourant;
	}



	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}


	

	public CompteEpargne getCompteEpargne() {
		return compteEpargne;
	}



	public void setCompteEpargne(CompteEpargne compteEpargne) {
		this.compteEpargne = compteEpargne;
	}



	@Override
	public String toString() {
		return "Client [id="+  id +", Nom=" + nom + ", Prenom=" + prenom + ", Adresse:"+ "Ville=" + adresse.getVille() +" CodePostale="+ adresse.getCodePostale()+" Telephone="+adresse.getTelephone() + " CompteCourant="+compteCourant+"CompteEpargne="+compteEpargne +"]";
	}


	
	

}
