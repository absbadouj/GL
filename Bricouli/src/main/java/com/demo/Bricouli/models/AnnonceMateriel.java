package com.demo.Bricouli.models;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
@DiscriminatorValue("AnnonceMateriel")
public class AnnonceMateriel extends Annonce implements Serializable {
	
	private String Type;
	private Double Prix;
	
	public AnnonceMateriel() {
		super();
	}


	public AnnonceMateriel(String type, Double prix) {
		super();
		Type = type;
		Prix = prix;
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
