package com.example.demo.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Adresse {

	
	private String ville;
	private String codePostale;
	private String telephone;
	
	
	public Adresse(String ville, String codePostale, String telephone) {

		this.ville = ville;
		this.codePostale = codePostale;
		this.telephone = telephone;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Adresse(String ville, String codePostale) {

		this.ville = ville;
		this.codePostale = codePostale;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getCodePostale() {
		return codePostale;
	}
	public void setCodePostale(String codePostale) {
		this.codePostale = codePostale;
	}
	@Override
	public String toString() {
		return "Adresse [ville=" + ville + ", codePostale=" + codePostale + ", telephone=" + telephone + "]";
	}

}
