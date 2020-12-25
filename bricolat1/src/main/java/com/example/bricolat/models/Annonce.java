package com.example.bricolat.models;

import java.io.Serializable;
import java.sql.Blob;

import javax.persistence.Entity;

@Entity
public class Annonce implements Serializable{
	private String idAnnonce;
	private String Titre;
	private String Subtitle;
	private String Ville;
	private String Description;
	private Double Note;
	private Boolean Valable;
	private Blob Image;
	
	public Annonce() {
		super();
	}

	public Annonce(String titre, String subtitle, String ville, String description, Double note, Boolean valable,
			Blob image) {
		super();
		Titre = titre;
		Subtitle = subtitle;
		Ville = ville;
		Description = description;
		Note = note;
		Valable = valable;
		Image = image;
	}

	public String getIdAnnonce() {
		return idAnnonce;
	}

	public void setIdAnnonce(String idAnnonce) {
		this.idAnnonce = idAnnonce;
	}

	public String getTitre() {
		return Titre;
	}

	public void setTitre(String titre) {
		Titre = titre;
	}

	public String getSubtitle() {
		return Subtitle;
	}

	public void setSubtitle(String subtitle) {
		Subtitle = subtitle;
	}

	public String getVille() {
		return Ville;
	}

	public void setVille(String ville) {
		Ville = ville;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Double getNote() {
		return Note;
	}

	public void setNote(Double note) {
		Note = note;
	}

	public Boolean getValable() {
		return Valable;
	}

	public void setValable(Boolean valable) {
		Valable = valable;
	}

	public Blob getImage() {
		return Image;
	}

	public void setImage(Blob image) {
		Image = image;
	}
	
	
}
