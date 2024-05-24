package com.example.demo.model;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;

@Entity
public class CompteCourant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Embedded
	private IdentiteCompte infos;
	
	private double decouvert = -1000;
	private String typeCompte="courant";
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@MapsId
	private Client client;

	public CompteCourant(IdentiteCompte infos) { 
		this.infos = infos;
	}
	
	public CompteCourant() {
		
	}

	
	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	
	public String getTypeCompte() {
		return typeCompte;
	}

	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}
	
	

	public IdentiteCompte getInfos() {
		return infos;
	}

	@Override
	public String toString() {
		return  "CompteCourant " + "[" +"NumeroDeCompte="+ infos.getNumeroDeCompte()+"Solde=" +infos.getSolde() +"Date Ouverture" +infos.getDateOuverture() + "decouvert=" + decouvert + ", typeCompte=" + typeCompte + "]";
	}

	
	

}
