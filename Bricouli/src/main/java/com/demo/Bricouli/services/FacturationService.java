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
	public Devis Ajouterdevis(Long idClient, Long idAnnonce, Devis d){
		User u = userRepository.findById(idClient).get();
		Annonce a = annonceRepository.findById(idAnnonce).get();
		d.setClient(u);
		d.setStatus(false);
		d.setAnnonce(a);
		d.setAnnonceur(a.getAnnonceur());
		d.setEtat("En attend");
		d.setMontant(0);
		return devisRepository.save(d);	
	}
	
	// Accepter le devis
	public Devis AccepterUnDevis(Long id, String message) {
		Devis d = devisRepository.findById(id).get();
		d.setStatus(true);
		// d.setMessage(message);
		d.setEtat("Accepté");
		return devisRepository.save(d);
	}
	
	// Refuser le devis
	public Devis RefuserUnDevis(Long id, String message) {
		Devis d = devisRepository.findById(id).get();
		d.setStatus(false);
		//d.setMessage(message);
		d.setEtat("Refuser");
		return devisRepository.save(d);
	}
	
	
	// Envoyer un devis
	public Devis EnvoyerUnDevis(Long id, int m) {
		Devis d = devisRepository.findById(id).get();
		d.setMontant(m);;
		d.setEtat("Envoyé");
		return devisRepository.save(d);
	}
	
	// Modifier le devis coté annonceur 
	public Devis Changerdevis(Long id, int m) {
		Devis d = devisRepository.findById(id).get();
		d.setMontant(m);
		d.setStatus(null);
		d.setMessage(null);
		d.setDate(new Date());
		d.setEtat("Devis Modifier");
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
	
	// get devis user
	public List<Devis> getDevisuser(Long iduser) {
		User u = userRepository.findById(iduser).get();
		return devisRepository.findByClient(u);
	}
	
	// get devis seller
		public List<Devis> getDevisseller(Long idseller) {
			User u = userRepository.findById(idseller).get();
			return devisRepository.findByAnnonceur(u);
		}
	
	// Facture 
	
	// get factures for admin
	public List<Facture> getfactures() {
		return factureRepository.findAll();
		
	}
	
	// get factures
	public Facture getfacture(Long id) {
		return factureRepository.findById(id).get();
	}
	
	// imprimer facture
	

}
