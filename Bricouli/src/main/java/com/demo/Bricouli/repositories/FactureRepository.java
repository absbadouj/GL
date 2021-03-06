package com.demo.Bricouli.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Bricouli.models.Facture;

@Repository
public interface FactureRepository extends JpaRepository<Facture, Long>{

}
