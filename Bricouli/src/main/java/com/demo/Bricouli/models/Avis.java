package com.demo.Bricouli.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Avis implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private double idAvis;
	private String Message;
	private int Stars;
	private Date date;
	
	@ManyToOne
	private User Client;
	
	@ManyToOne 
	private Commande commande;

	public Avis() {
		super();
	}
	public Avis(String message, int stars) {
		super();
		Message = message;
		Stars = stars;
	}
	
	public Avis(String message, int stars, User client, Commande commande) {
		super();
		Message = message;
		Stars = stars;
		this.date = new Date();
		Client = client;
		this.commande = commande;
	}
	public double getIdAvis() {
		return idAvis;
	}
	public void setIdAvis(double idAvis) {
		this.idAvis = idAvis;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public int getStars() {
		return Stars;
	}
	public void setStars(int stars) {
		Stars = stars;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public User getClient() {
		return Client;
	}
	public void setClient(User client) {
		Client = client;
	}
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	
	
	

}
