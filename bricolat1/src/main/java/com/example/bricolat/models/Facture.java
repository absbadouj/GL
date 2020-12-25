package com.example.bricolat.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Facture implements Serializable{
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String IdFacture;
	private Double Montant;
	private String Etat;
	
	public Facture() {
		super();
	}

	public Facture(Double montant, String etat) {
		super();
		Montant = montant;
		Etat = etat;
	}

	public String getIdFacture() {
		return IdFacture;
	}

	public void setIdFacture(String idFacture) {
		IdFacture = idFacture;
	}

	public Double getMontant() {
		return Montant;
	}

	public void setMontant(Double montant) {
		Montant = montant;
	}

	public String getEtat() {
		return Etat;
	}

	public void setEtat(String etat) {
		Etat = etat;
	}
	
	
	
}
