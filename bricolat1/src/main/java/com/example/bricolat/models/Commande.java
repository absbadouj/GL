package com.example.bricolat.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Commande implements Serializable{
	
	private String idCommande;
	private Date date;
	private String Etat;
	private String AdresseLiv;
	private Boolean Regler;
	
	public Commande() {
		super();
	}

	public Commande(Date date, String etat, String adresseLiv, Boolean regler) {
		super();
		this.date = date;
		Etat = etat;
		AdresseLiv = adresseLiv;
		Regler = regler;
	}

	public String getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(String idCommande) {
		this.idCommande = idCommande;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getEtat() {
		return Etat;
	}

	public void setEtat(String etat) {
		Etat = etat;
	}

	public String getAdresseLiv() {
		return AdresseLiv;
	}

	public void setAdresseLiv(String adresseLiv) {
		AdresseLiv = adresseLiv;
	}

	public Boolean getRegler() {
		return Regler;
	}

	public void setRegler(Boolean regler) {
		Regler = regler;
	}
	
	
	
}
