package com.demo.Bricouli.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("AnnonceService")
public class AnnonceService extends Annonce implements Serializable{
	
	private String idService;
	

	public AnnonceService() {
		super();
	}

	public AnnonceService(String idService) {
		super();
		
	}

	public String getIdService() {
		return idService;
	}

	public void setIdService(String idService) {
		this.idService = idService;
	}

	public List<Annonce> annonces() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
}
