package com.demo.Bricouli.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Bricouli.models.Annonce;
import com.demo.Bricouli.models.Annonceur;
import com.demo.Bricouli.models.Avis;
import com.demo.Bricouli.models.Commande;
import com.demo.Bricouli.models.Devis;
import com.demo.Bricouli.models.User;
import com.demo.Bricouli.repositories.AnnonceRepository;
import com.demo.Bricouli.repositories.AnnonceurRepository;
import com.demo.Bricouli.repositories.AvisRepository;
import com.demo.Bricouli.repositories.CommandeRepository;
import com.demo.Bricouli.repositories.DevisRepository;
import com.demo.Bricouli.repositories.UserRepository;

@Service
public class CommandesService {
	
	@Autowired CommandeRepository commandeRepository;
	@Autowired AnnonceRepository annonceRepository;
	@Autowired UserRepository userRepository;
	@Autowired DevisRepository devisRepository;
	@Autowired AvisRepository avisRepository;
	@Autowired AnnonceurRepository annonceurRepository;
	

	
	// get all orders ordered for admin 
	public List<Commande> commandelatest(){
		return commandeRepository.findAll();
	}
	
	// get order
	public Commande getorder(Long id) {
		return commandeRepository.findById(id).get();
	}
	
	// Mentionner une commande comme terminer 
	public Commande commandeterminer(Long id){
		Commande c = commandeRepository.findById(id).get();
		c.setEtat("Terminée");
		return commandeRepository.save(c);
	}
	
	// Mentionner une commande comme Livrer
	public Commande commandeLivrer(Long id){
		Commande c = commandeRepository.findById(id).get();
		c.setEtat("Livrée");
		c.setDateLiv(new Date());
		return commandeRepository.save(c);
	}
	
	// Demande de retouche
	public Commande DemandedeRetouche(Long id, String dateLivPrevu) {
		Commande c = commandeRepository.findById(id).get();
		c.setEtat("En cours");
		c.setDateLivPrevu(dateLivPrevu);
		return commandeRepository.findById(id).get();
	}
	
	
	// Commande payée
	public Commande commanderegler(Long id) {
		Commande c = commandeRepository.findById(id).get();
		c.setEtat("Payée");
		c.setRegle(true);
		return commandeRepository.save(c);
	}
	
	// Passer une commande
	public Commande PasserCommade(Long idClient, Long iddevis) {
		User u = userRepository.findById(idClient).get();
		Devis d = devisRepository.findById(iddevis).get();
		Annonce a = d.getAnnonce();
		Annonceur an = a.getAnnonceur();
		Commande commande = new Commande();
		commande.setClient(u);
		commande.setDevis(d);
		commande.setAnnonce(a);
		commande.setAnnonceur(an);
		commande.setEtat("Non payée");
		commande.setRegle(false);
		return commandeRepository.save(commande);
		
	}
	
	// get commande user
	public List<Commande> getcommandeuser(Long iduser) {
		User u = userRepository.findById(iduser).get();
		return commandeRepository.findByClient(u);
		
		}
		
	// // get commande seller
		public List<Commande> getcommandeseller(Long iduser) {
			Annonceur an = annonceurRepository.findById(iduser).get();
			return commandeRepository.findByAnnonceur(an);
		}
	
	// Annuler une commande 
	public Commande AnnulerCommande(Long id) {
		Commande c = commandeRepository.findById(id).get();
		c.setEtat("Annulée");
		return commandeRepository.save(c);
	}
	
	public Avis Ajouteravis(Long idcommande, Avis avis) {
		Commande c = commandeRepository.findById(idcommande).get();
		Annonce a = c.getAnnonce();
		User u = c.getClient();
		avis.setCommande(c);
		avis.setClient(u);
		avis.setDate(new Date());
		return avisRepository.save(avis);

		
	}
	
	// Avis 
	// Ajouter un avis
	
	/* public Avis Ajouteravis(Long idclient, Long idcommande, String msg, int stars) {
		Commande c = commandeRepository.findById(idcommande).get();
		User u = userRepository.findById(idclient).get();
		Avis a = new Avis(msg,stars,u,c);
		return avisRepository.save(a);
	}*/
	
	
}
