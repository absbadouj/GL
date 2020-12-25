package com.example.bricolat.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AnnonceService extends Annonce implements Serializable{
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
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
