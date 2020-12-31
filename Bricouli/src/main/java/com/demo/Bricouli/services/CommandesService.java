package com.demo.Bricouli.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Bricouli.models.Annonce;
import com.demo.Bricouli.models.Commande;
import com.demo.Bricouli.repositories.CommandeRepository;

@Service
public class CommandesService {
	
	@Autowired CommandeRepository commandeRepository;
	
	// get all orders ordered for admin 
	public List<Commande> commandelatest(){
		return commandeRepository.findAll();
	}
	
	public List<Commande> commandeterminer(String s){
		return commandeRepository.findByEtat(s);
	}
	
	
	
}
