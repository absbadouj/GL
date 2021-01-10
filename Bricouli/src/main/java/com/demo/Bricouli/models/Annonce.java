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

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="annoncetype")
public class Annonce implements Serializable{
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAnnonce;
	private String titre;
	private String subtitle;
	private String ville;
	private String Description;
	private Double note;
	private Boolean valable;
	private String categorie;
	private int duree;
	
	@OneToMany
	private List<Avis> avis = new ArrayList<>();
	
	@ManyToOne
	private Annonceur annonceur;
	
	@ManyToOne
	private DBFiles image;
	
	public Annonce() {
		super();
	}

	public Annonce(String titre, String subtitle, String ville, String description, Double note, Boolean valable) {
		super();
		this.titre = titre;
		this.subtitle = subtitle;
		this.ville = ville;
		Description = description;
		this.note = note;
		this.valable = valable;
		
	}

	public Long getIdAnnonce() {
		return idAnnonce;
	}

	public void setIdAnnonce(Long idAnnonce) {
		this.idAnnonce = idAnnonce;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Double getNote() {
		return note;
	}

	public void setNote(Double note) {
		this.note = note;
	}

	public Boolean getValable() {
		return valable;
	}

	public void setValable(Boolean valable) {
		this.valable = valable;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public List<Avis> getAvis() {
		return avis;
	}

	public void setAvis(List<Avis> avis) {
		this.avis = avis;
	}

	public Annonceur getAnnonceur() {
		return annonceur;
	}

	public void setAnnonceur(Annonceur annonceur) {
		this.annonceur = annonceur;
	}

	public DBFiles getImage() {
		return image;
	}

	public void setImage(DBFiles image) {
		this.image = image;
	}
	
	


	
	
	
	
	
	
	
}
