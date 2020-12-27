package com.demo.Bricouli.models;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("M")
public class AnnonceMateriel extends Annonce implements Serializable {
	
	private double id;
	private String Type;
	private Double Prix;
	
	public AnnonceMateriel() {
		super();
	}

	public double getId() {
		return id;
	}

	public void setId(double id) {
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
