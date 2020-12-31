package com.demo.Bricouli.models;

import java.io.Serializable;
import java.sql.Blob;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="user_type")
public class User implements Serializable {
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Iduser;
	private String Nom;
	private String Prenom;
	private String email;
	private String Cin;
	private String Tel;
	private String Adresse;
	private String Ville; 
	private Boolean Confirmed;
	private String Passe;
	private Boolean Annonceur;
	private Blob Image;
	
	public User(String nom, String prenom, String email, String cin, String tel, String adresse, String ville,
			Boolean confirmed, String passe, Boolean annonceur, Blob image) {
		super();
		Nom = nom;
		Prenom = prenom;
		email = email;
		Cin = cin;
		Tel = tel;
		Adresse = adresse;
		Ville = ville;
		Confirmed = confirmed;
		Passe = passe;
		Annonceur = annonceur;
		Image = image;
	}

	public User() {
		super();
	}

	public Long getIduser() {
		return Iduser;
	}

	public void setIduser(Long iduser) {
		Iduser = iduser;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		email = email;
	}

	public String getCin() {
		return Cin;
	}

	public void setCin(String cin) {
		Cin = cin;
	}

	public String getTel() {
		return Tel;
	}

	public void setTel(String tel) {
		Tel = tel;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public String getVille() {
		return Ville;
	}

	public void setVille(String ville) {
		Ville = ville;
	}

	public Boolean getConfirmed() {
		return Confirmed;
	}

	public void setConfirmed(Boolean confirmed) {
		Confirmed = confirmed;
	}

	public String getPasse() {
		return Passe;
	}

	public void setPasse(String passe) {
		Passe = passe;
	}

	public Boolean getAnnonceur() {
		return Annonceur;
	}

	public void setAnnonceur(Boolean annonceur) {
		Annonceur = annonceur;
	}

	public Blob getImage() {
		return Image;
	}

	public void setImage(Blob image) {
		Image = image;
	}
	
	
	

}
