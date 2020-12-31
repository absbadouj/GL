package com.demo.Bricouli.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.demo.Bricouli.models.Annonce;
import com.demo.Bricouli.models.AnnonceMateriel;
import com.demo.Bricouli.models.AnnonceService;
import com.demo.Bricouli.models.Annonceur;
import com.demo.Bricouli.models.User;
import com.demo.Bricouli.repositories.AnnonceMRepository;
import com.demo.Bricouli.repositories.AnnonceRepository;
import com.demo.Bricouli.repositories.AnnonceSRepository;
import com.demo.Bricouli.repositories.AnnonceurRepository;

@Service
public class AnnoncesService {
	
	
	@Autowired AnnonceRepository annonceRepository;
	@Autowired AnnonceSRepository annonceSRepository;
	@Autowired AnnonceMRepository annonceMRepository;
	@Autowired AnnonceurRepository annoncuerRepository;
	
	
	
	// get all annonces 
		public List<Annonce> annonces(){
			return annonceRepository.findAll();
		}
		
	// get an annonce 
		
		public Annonce getannonce(Long id){
			Annonce a = annonceRepository.findById(id).get();
			return a;
		}
		
	// add service annonce 
		public AnnonceService savingAnnonceService(AnnonceService as, Long id){
			Annonceur a = annoncuerRepository.findById(id).get();
			as.setAnnonceur(a);
			return annonceSRepository.save(as);
	    }
		
		
	// add materiel annonce
		public AnnonceMateriel savingAnnonceMateriel(AnnonceMateriel am, Long id) {
			Annonceur a = annoncuerRepository.findById(id).get();
			am.setAnnonceur(a);
			return annonceMRepository.save(am);
			
		}
		
	// get all services annonces
		public List<AnnonceService> getallservice(){
			 return annonceSRepository.findAll();
		 }
		
	// get all materiels annonces	
		public List<AnnonceMateriel> getallmateriel(){
			 return annonceMRepository.findAll();
		}
		
	// get annonces by category 
		public List<Annonce> getbycategory(String s){
			return annonceRepository.findByCategorie(s);
		}
		
	// get annonces by title 
		public List<Annonce> getbytitle(String s){
			return annonceRepository.findByTitreContaining(s);
		}
	
	// get annonce non valide pour admin
		public List<Annonce> getbyvalable(boolean v){
			return annonceRepository.findByValable(v);
		}

		

}
