package com.example.bricolat.models;

import java.io.Serializable;
import java.sql.Blob;

import javax.persistence.Entity;

@Entity
public class User implements Serializable {
	
	private String Iduser;
	private String Nom;
	private String Prenom;
	private String Email;
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
		Email = email;
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

	public String getIduser() {
		return Iduser;
	}

	public void setIduser(String iduser) {
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

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
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
