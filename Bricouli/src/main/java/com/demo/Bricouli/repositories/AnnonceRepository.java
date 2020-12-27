package com.demo.Bricouli.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Bricouli.models.Annonce;

@Repository
public interface AnnonceRepository extends JpaRepository<Annonce, Double>{

}
