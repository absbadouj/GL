package com.demo.Bricouli.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Devis implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdDevis;
	private int montant;
	private Boolean status;
	private String message;
	private String adresse;
	private Date date;
	private Date time = new Date();
	private String etat;
	
	
	@OneToOne
	private Annonce annonce;
	
	@OneToOne
	private User client;
	
	@OneToOne
	private DBFiles fichier;
	
	@OneToOne
	private User annonceur;
	
	
	public Devis() {
		super();
	}
	
	

	public Devis(int montant, Boolean status, String message, String adresse, Date date, Annonce annonce,
			User client) {
		super();
		this.montant = montant;
		this.status = status;
		this.message = message;
		this.adresse = adresse;
		this.date = date;
		this.annonce = annonce;
		this.client = client;
	}



	public Long getIdDevis() {
		return IdDevis;
	}

	public void setIdDevis(Long idDevis) {
		IdDevis = idDevis;
	}

	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


	public Annonce getAnnonce() {
		return annonce;
	}

	public void setAnnonce(Annonce annonce) {
		this.annonce = annonce;
	}

	public User getClient() {
		return client;
	}

	public void setClient(User client) {
		this.client = client;
	}

	public DBFiles getFichier() {
		return fichier;
	}

	public void setFichier(DBFiles fichier) {
		this.fichier = fichier;
	}



	public Date getTime() {
		return time;
	}



	public void setTime(Date time) {
		this.time = time;
	}



	public String getEtat() {
		return etat;
	}


	public void setEtat(String etat) {
		this.etat = etat;
	}



	public User getAnnonceur() {
		return annonceur;
	}



	public void setAnnonceur(User Annonceur) {
		 annonceur = Annonceur;
	}
	
	
	
}
