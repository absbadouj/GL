package com.demo.Bricouli.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Bricouli.models.Annonceur;
import com.demo.Bricouli.models.Commande;
import com.demo.Bricouli.models.User;

@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long>{

	List<Commande> findByClient(User u);

	List<Commande> findByAnnonceur(Annonceur an);



}
