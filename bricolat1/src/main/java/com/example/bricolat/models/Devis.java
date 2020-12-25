package com.example.bricolat.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Devis implements Serializable {
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String IdDevis;
	private Double Montant;
	private Boolean Status;
	private String Message;
	private Date date;
	private Date heure;
	
	public Devis() {
		super();
	}

	public Devis(Double montant, Boolean status, String message, Date date, Date heure) {
		super();
		Montant = montant;
		Status = status;
		Message = message;
		this.date = date;
		this.heure = heure;
	}

	public String getIdDevis() {
		return IdDevis;
	}

	public void setIdDevis(String idDevis) {
		IdDevis = idDevis;
	}

	public Double getMontant() {
		return Montant;
	}

	public void setMontant(Double montant) {
		Montant = montant;
	}

	public Boolean getStatus() {
		return Status;
	}

	public void setStatus(Boolean status) {
		Status = status;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getHeure() {
		return heure;
	}

	public void setHeure(Date heure) {
		this.heure = heure;
	}
	
	
	
}
