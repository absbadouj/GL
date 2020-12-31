package com.demo.Bricouli.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Bricouli.models.Devis;

@Repository
public interface DevisRepository extends JpaRepository<Devis, Long>{

}
