package com.demo.Bricouli.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Bricouli.models.Annonce;
import com.demo.Bricouli.models.AnnonceMateriel;
import com.demo.Bricouli.models.AnnonceService;

@Repository
public interface AnnonceRepository extends JpaRepository<Annonce, Long>{

   

}
