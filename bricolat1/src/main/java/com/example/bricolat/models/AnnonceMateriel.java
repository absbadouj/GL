package com.example.bricolat.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AnnonceMateriel extends Annonce implements Serializable {
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String Type;
	private Double Prix;
	
	public AnnonceMateriel() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public Double getPrix() {
		return Prix;
	}

	public void setPrix(Double prix) {
		Prix = prix;
	} 
	
	
	
}
