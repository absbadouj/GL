package com.demo.Bricouli.models;

import java.io.Serializable;

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
	
	@ManyToOne
	private User Client;
	

	public Avis() {
		super();
	}
	public Avis(String message, int stars) {
		super();
		Message = message;
		Stars = stars;
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
	
	

}
