package com.demo.Bricouli.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Bricouli.models.Commande;

@Repository
public interface CommandeRepository extends JpaRepository<Commande, Double>{

}