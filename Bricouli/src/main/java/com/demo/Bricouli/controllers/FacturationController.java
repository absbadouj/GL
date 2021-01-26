package com.demo.Bricouli.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Bricouli.models.Devis;
import com.demo.Bricouli.services.CommandesService;
import com.demo.Bricouli.services.FacturationService;


@CrossOrigin("*")
@RestController
@RequestMapping("/devis")
public class FacturationController {
	
	@Autowired FacturationService facturationService;
	@Autowired CommandesService commandeService;
	
	
	@PostMapping("/add/devis/{iduser}/{idAnnonce}")
    public Devis addMateriel(@RequestBody Devis d, @PathVariable Long iduser, @PathVariable Long idAnnonce) {
        return facturationService.Ajouterdevis(iduser,idAnnonce,d);
	}
	
	@GetMapping("/{id}")
	 public List<Devis> getdevis(@PathVariable Long id){ 
			return facturationService.getDevisuser(id);
	 }
	
	@GetMapping("/seller/{id}")
	 public List<Devis> getdevisseller(@PathVariable Long id){ 
			return facturationService.getDevisseller(id);
	 }
	
	@GetMapping("/afficher/{id}")
	 public Devis getOnedevis(@PathVariable Long id){ 
			return facturationService.getDevis(id);
	 }
	
	@PostMapping("/accepter/devis/{id}")
	 public Devis accepterdevis(@PathVariable Long id, @RequestBody String m){ 
		return facturationService.AccepterUnDevis(id,m);
	}
	
	@PostMapping("/refuser/devis/{id}")
	 public Devis refuserdevis(@PathVariable Long id, @RequestBody String m){ 
		return facturationService.RefuserUnDevis(id,m);
	}
	
	@PostMapping("/envoyer/devis/{id}/montant={mnt}")
	 public Devis envoyerdevis(@PathVariable Long id, @PathVariable int mnt){ 
		return facturationService.EnvoyerUnDevis(id,mnt);
	}
	
	
}
