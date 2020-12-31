package com.demo.Bricouli.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Bricouli.models.Annonce;
import com.demo.Bricouli.models.Devis;
import com.demo.Bricouli.models.Facture;
import com.demo.Bricouli.models.User;
import com.demo.Bricouli.repositories.AnnonceRepository;
import com.demo.Bricouli.repositories.DevisRepository;
import com.demo.Bricouli.repositories.FactureRepository;
import com.demo.Bricouli.repositories.UserRepository;

@Service
public class FacturationService {
	
	@Autowired DevisRepository devisRepository;
	@Autowired FactureRepository factureRepository;
	@Autowired AnnonceRepository annonceRepository;
	@Autowired UserRepository userRepository;
	
	
	// Ajouter un devis
	public Devis lesdevis(Long idClient, Long idAnnonce, Devis d){
		User u = userRepository.findById(idClient).get();
		Annonce a = annonceRepository.findById(idAnnonce).get();
		d.setClient(u);
		d.setAnnonce(a);
		return devisRepository.save(d);	
	}
	
	// Accepter le devis
	public Devis AccepterUnDevis(Long id, String message) {
		Devis d = devisRepository.findById(id).get();
		d.setStatus(true);
		d.setMessage(message);
		return devisRepository.save(d);
	}
	
	// Refuser le devis
	public Devis RefuserUnDevis(Long id, String message) {
		Devis d = devisRepository.findById(id).get();
		d.setStatus(false);
		d.setMessage(message);
		return devisRepository.save(d);
	}
	
	// Modifier le devis coté annonceur 
	public Devis Changerdevis(Long id, Double m) {
		Devis d = devisRepository.findById(id).get();
		d.setMontant(m);
		d.setStatus(null);
		d.setMessage(null);
		d.setDate(new Date());
		return devisRepository.save(d);
	}
	
	// get all devis Admin
	public List<Devis> getalldevis(){
		return devisRepository.findAll();
	}
	// get devis client 
	public Devis getDevis(Long id) {
		return devisRepository.findById(id).get();
	}
	
	// Facture 
	
	// get factures for admin
	public List<Facture> getfactures() {
		return factureRepository.findAll();
		
	}
	
	// get factur 
	public Facture getfacture(Long id) {
		return factureRepository.findById(id).get();
	}
	
	// imprimer factur

}
