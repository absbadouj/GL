package com.example.bricolat.models;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class AnnonceService extends Annonce implements Serializable{
	
	private String idService;

	public AnnonceService(String idService) {
		super();
		
	}

	public String getIdService() {
		return idService;
	}

	public void setIdService(String idService) {
		this.idService = idService;
	}
	
	
	
	
}
