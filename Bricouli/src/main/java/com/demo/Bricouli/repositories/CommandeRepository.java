package com.demo.Bricouli.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Bricouli.models.Commande;

@Repository
public interface CommandeRepository extends JpaRepository<Commande, Double>{

	List<Commande> findByEtat(String s);

}
