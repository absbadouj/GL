package com.demo.Bricouli.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Bricouli.models.Annonceur;

@Repository
public interface AnnonceurRepository extends JpaRepository<Annonceur, Double> {

}
