package com.demo.Bricouli.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Bricouli.models.Annonce;
import com.demo.Bricouli.models.AnnonceMateriel;
import com.demo.Bricouli.models.AnnonceService;
import com.demo.Bricouli.models.Annonceur;

@Repository
public interface AnnonceRepository extends JpaRepository<Annonce, Long>{

	

	List<Annonce> findByCategorie(String s);
	List<Annonce> findByTitreContaining(String s);
	List<Annonce> findByValable(boolean v);
	List<Annonce> findByAnnonceur(Annonceur a);
	
   

}
