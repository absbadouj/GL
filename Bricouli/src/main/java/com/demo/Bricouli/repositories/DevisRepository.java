package com.demo.Bricouli.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Bricouli.models.Devis;
import com.demo.Bricouli.models.User;

@Repository
public interface DevisRepository extends JpaRepository<Devis, Long>{

	List<Devis> findByClient(User u);
	List<Devis> findByAnnonceur(User u);
	

}
