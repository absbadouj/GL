package com.demo.Bricouli.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Bricouli.models.Avis;
import com.demo.Bricouli.models.Commande;
import com.demo.Bricouli.services.CommandesService;
import com.demo.Bricouli.services.FacturationService;

@CrossOrigin("*")
@RestController
@RequestMapping("/commande")
public class CommandeController {
	
	@Autowired CommandesService commandeService;
	@Autowired FacturationService facturationService;
	
	
	@PostMapping("/passer/{iduser}/{idDevis}")
    public Commande addCommande(@PathVariable Long iduser, @PathVariable Long idDevis) {
        return commandeService.PasserCommade(iduser,idDevis);
	}
	
	@GetMapping("/afficher/{id}")
	 public Commande getdevis(@PathVariable Long id){ 
			return commandeService.getorder(id);
	 }
	
	@GetMapping("/afficher/seller/{id}")
	public List<Commande> Commandeventes(@PathVariable Long id){ 
			return commandeService.getcommandeseller(id);
	 }
	
	@GetMapping("/afficher/client/{id}")
	public List<Commande> Commandeachat(@PathVariable Long id){ 
			return commandeService.getcommandeuser(id);
	 }
	
	
	@PostMapping("/livrer/{id}")
    public Commande Livercommande(@PathVariable Long id) {
        return commandeService.commandeLivrer(id);
	}
	
	@PostMapping("/terminer/{id}")
    public Commande terminercommande(@PathVariable Long id) {
        return commandeService.commandeterminer(id);
	}
	
	@PostMapping("/ajouter/avis/{id}")
	public Avis addreview(@PathVariable Long id, @RequestBody Avis avis) {
		return commandeService.Ajouteravis(id, avis);
	}
	
	
}
