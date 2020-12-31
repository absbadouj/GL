package com.demo.Bricouli.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Bricouli.models.AnnonceMateriel;

@Repository
public interface AnnonceMRepository extends JpaRepository<AnnonceMateriel, Long> {
	
	

}
