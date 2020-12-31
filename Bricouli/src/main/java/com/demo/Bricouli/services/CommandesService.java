package com.demo.Bricouli.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Bricouli.models.Annonce;
import com.demo.Bricouli.models.Commande;
import com.demo.Bricouli.models.User;
import com.demo.Bricouli.repositories.AnnonceRepository;
import com.demo.Bricouli.repositories.CommandeRepository;
import com.demo.Bricouli.repositories.UserRepository;

@Service
public class CommandesService {
	
	@Autowired CommandeRepository commandeRepository;
	@Autowired AnnonceRepository annonceRepository;
	@Autowired UserRepository userRepository;
	
	// get all orders ordered for admin 
	public List<Commande> commandelatest(){
		return commandeRepository.findAll();
	}
	
	public List<Commande> commandeterminer(String s){
		return commandeRepository.findByEtat(s);
	}
	
	public Commande changeretat(Long id, String etat) {
		Commande c = commandeRepository.findById(id).get();
		c.setEtat(etat);
		return commandeRepository.save(c);
	}
	
	public Commande commanderegler(Long id) {
		Commande c = commandeRepository.findById(id).get();
		c.setRegle(true);
		return commandeRepository.save(c);
	}
	
	public Commande PasserCommade(Long idClient, Long idAnnonce, Commande commande) {
		User u = userRepository.findById(idClient).get();
		Annonce a = annonceRepository.findById(idAnnonce).get();
		commande.setClient(u);
		return commandeRepository.save(commande);
		
	}
	
	
}
