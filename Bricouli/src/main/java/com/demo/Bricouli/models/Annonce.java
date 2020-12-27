package com.demo.Bricouli.models;

import java.io.Serializable;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="Annonce_type")
public class Annonce implements Serializable{
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Double idAnnonce;
	private String Titre;
	private String Subtitle;
	private String Ville;
	private String Description;
	private Double Note;
	private Boolean Valable;
	private Blob Image;
	
	@OneToMany
	private List<Avis> avis = new ArrayList<>();
	
	@ManyToOne
	private Annonceur annonceur;
	
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

	public Double getIdAnnonce() {
		return idAnnonce;
	}

	public void setIdAnnonce(Double idAnnonce) {
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
