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
public class CompteCourant extends Compte{
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
	
//	@Embedded
//	private IdentiteCompte infos;
	
	private double decouvert = -1000;
	
//	@OneToOne(mappedBy="compteCourant",cascade=CascadeType.PERSIST)
//	private Client client;

//	public CompteCourant(IdentiteCompte infos) { 
//		this.infos = infos;
//	}
	
//	
	public CompteCourant() {
		// TODO Auto-generated constructor stub
	}
	public CompteCourant(String numeroDeCompte, double solde) {
		super(numeroDeCompte,solde);
		
	}

	
	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	

	@Override
	public String toString() {
		return "CompteCourant [" + super.toString()+ "decouvert=" + decouvert + "]"; // typeCompte=" + typeCompte + 
	}
	

	
	

//	public IdentiteCompte getInfos() {
//		return infos;
//	}

//	@Override
//	public String toString() {
//		return  "CompteCourant " + "[" +"NumeroDeCompte="+ infos.getNumeroDeCompte()+"Solde=" +infos.getSolde() +"Date Ouverture" +infos.getDateOuverture() + "decouvert=" + decouvert + ", typeCompte=" + typeCompte + "]";
//	}

	
	

}
