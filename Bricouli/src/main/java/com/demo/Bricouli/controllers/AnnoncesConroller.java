package com.demo.Bricouli.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Bricouli.models.Annonce;
import com.demo.Bricouli.models.AnnonceMateriel;
import com.demo.Bricouli.models.AnnonceService;
import com.demo.Bricouli.models.User;
import com.demo.Bricouli.services.AnnoncesService;

@RestController
@RequestMapping("/annonces")
public class AnnoncesConroller {
	
	 @Autowired AnnoncesService annoncesService;
	
	 @GetMapping("/afficher")
	 public  List<Annonce> getAnnonce(){ 
			return annoncesService.annonces();
	 }
	
	 @GetMapping("/{id}")
	 public Annonce getAnnonce(@PathVariable Long id){ 
			return annoncesService.getannonce(id);
	 }
	 
	
	 @PostMapping("/add/service/{id}")
	    public AnnonceService addAnnonce(@RequestBody AnnonceService as, @PathVariable Long id) {
	        return annoncesService.savingAnnonceService(as,id);
	 }
	 
	 @PostMapping("/add/materiel/{id}")
	    public AnnonceMateriel addMateriel(@RequestBody AnnonceMateriel am, @PathVariable Long id) {
	        return annoncesService.savingAnnonceMateriel(am,id);
	 }
	 
	 @GetMapping("/Afficher/services")
	 public List<AnnonceService> getallservice(){
		 return annoncesService.getallservice();
	 }

	 @GetMapping("/Afficher/materiels")
	 public List<AnnonceMateriel> getallmater(){
		 return annoncesService.getallmateriel();
	 }
	 
	
}
