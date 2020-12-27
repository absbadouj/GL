package com.demo.Bricouli.models;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("S")
public class AnnonceService extends Annonce implements Serializable{
	
	private double idService;

	public AnnonceService(String idService) {
		super();
		
	}

	public double getIdService() {
		return idService;
	}

	public void setIdService(double idService) {
		this.idService = idService;
	}
	
	
	
	
}
