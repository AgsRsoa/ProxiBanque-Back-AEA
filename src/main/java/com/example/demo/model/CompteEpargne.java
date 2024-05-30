package com.example.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class CompteEpargne extends Compte  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Embedded
	private IdentiteCompte infos;
	private String typeCompte = "epargne";
	
	@OneToOne(cascade=CascadeType.PERSIST)
	private Client client;

	public CompteEpargne( IdentiteCompte infos) {
		this.infos = infos;
	
	}

	public String getTypeCompte() {
		return typeCompte;
	}

	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}

	
	@Override
	public String toString() {
		return  "CompteEpargne [" + "NumeroDeCompte="+ infos.getNumeroDeCompte()+"Solde=" +infos.getSolde() +"Date Ouverture" +infos.getDateOuverture()  + "TypeCompte=" + typeCompte + "]";
	}

	
	
}
