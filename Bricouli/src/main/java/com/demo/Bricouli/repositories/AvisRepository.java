package com.demo.Bricouli.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Bricouli.models.Avis;

@Repository
public interface AvisRepository extends JpaRepository<Avis, Double>{

}
