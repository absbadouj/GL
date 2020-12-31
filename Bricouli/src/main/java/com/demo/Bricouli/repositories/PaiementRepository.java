package com.demo.Bricouli.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Bricouli.models.Paiement;

@Repository
public interface PaiementRepository extends JpaRepository<Paiement, Long>{

}
