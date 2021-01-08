package com.demo.Bricouli.models;

import java.io.Serializable;
import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Paiement implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String justification;
	private Blob recu;
	private Boolean valide;
	
	@OneToOne
	private Commande commande;
	
	@OneToOne
	private DBFiles fichier;
	
	public Paiement() {
		super();
	}

	public Paiement(String justification, Blob recu, Boolean valide) {
		super();
		this.justification = justification;
		this.recu = recu;
		this.valide = valide;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJustification() {
		return justification;
	}

	public void setJustification(String justification) {
		this.justification = justification;
	}

	public Blob getRecu() {
		return recu;
	}

	public void setRecu(Blob recu) {
		this.recu = recu;
	}

	public Boolean getValide() {
		return valide;
	}

	public void setValide(Boolean valide) {
		this.valide = valide;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public DBFiles getFichier() {
		return fichier;
	}

	public void setFichier(DBFiles fichier) {
		this.fichier = fichier;
	}
	
	
	
	
	
	

}
