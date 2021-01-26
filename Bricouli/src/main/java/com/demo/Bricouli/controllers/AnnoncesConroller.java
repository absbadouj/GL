package com.demo.Bricouli.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.demo.Bricouli.models.Annonce;
import com.demo.Bricouli.models.AnnonceMateriel;
import com.demo.Bricouli.models.AnnonceService;
import com.demo.Bricouli.models.DBFiles;
import com.demo.Bricouli.models.User;
import com.demo.Bricouli.services.AnnoncesService;
import com.demo.Bricouli.services.DBFilesServices;
@CrossOrigin("*")
@RestController
@RequestMapping("/annonces")
public class AnnoncesConroller {
	
	 @Autowired AnnoncesService annoncesService;
	 @Autowired DBFilesServices dbfilesService;

	
	 @GetMapping("/afficher")
	 public  List<Annonce> getAnnonce(){ 
			return annoncesService.annonces();
	 }
	
	 @GetMapping("/{id}")
	 public Annonce getAnnonce(@PathVariable Long id){ 
			return annoncesService.getannonce(id);
	 }
	 
	 @PostMapping("/add/{idfile}/service/{id}")
	    public AnnonceService addAnnonce(@RequestBody AnnonceService as,@PathVariable Long idfile, @PathVariable Long id) {
		 DBFiles dbFile = new DBFiles();
		 dbFile.setId(idfile);
		 as.setImage(dbFile);
	        return annoncesService.savingAnnonceService(as,id);
	 }
	 
	 @PostMapping("/add/materiel/{id}")
	    public Annonce addMateriel(@RequestBody Annonce an, @PathVariable Long id) {
	        return annoncesService.savingAnnonce(an,id);
	 }
	 
	 @GetMapping("/Afficher/services")
	 public List<AnnonceService> getallservice(){
		 return annoncesService.getallservice();
	 }

	 @GetMapping("/Afficher/materiels")
	 public List<AnnonceMateriel> getallmater(){
		 return annoncesService.getallmateriel();
	 }
	 
	 @GetMapping("/Afficher/services/user/{id}")
	 public List<Annonce> getallserviceseller(@PathVariable Long id){
		 return annoncesService.getannoncesseller(id);
	 }
	 
	
}
