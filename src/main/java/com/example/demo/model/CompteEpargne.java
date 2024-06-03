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

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
	
//	@Embedded
//	private IdentiteCompte infos;


	private Double tauxDeRemuneration= 0.03;
	
//	@OneToOne(cascade=CascadeType.PERSIST)
//	private Client client;

//	public CompteEpargne( IdentiteCompte infos) {
//		this.infos = infos;
//	
//	}
	
	public CompteEpargne() {
		// TODO Auto-generated constructor stub
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
		return "CompteEpargne ["+ super.toString()+ "tauxDeRemuneration=" + tauxDeRemuneration + "]"; //+"typeCompte=" + typeCompte + "
	}


	
//	@Override
//	public String toString() {
//		return  "CompteEpargne [" + "NumeroDeCompte="+ infos.getNumeroDeCompte()+"Solde=" +infos.getSolde() +"Date Ouverture" +infos.getDateOuverture()  + "TypeCompte=" + typeCompte + "]";
//	}

	
	
}
