package com.demo.Bricouli.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Facture implements Serializable{
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private double IdFacture;
	private Double Montant;
	private String Etat;
	
	@OneToOne
	private Commande commande;
	
	public Facture() {
		super();
	}

	public Facture(Double montant, String etat) {
		super();
		Montant = montant;
		Etat = etat;
	}

	public double getIdFacture() {
		return IdFacture;
	}

	public void setIdFacture(double idFacture) {
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

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	
	
	
	
	
}
