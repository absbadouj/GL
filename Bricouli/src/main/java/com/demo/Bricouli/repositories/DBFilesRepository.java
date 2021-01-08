package com.demo.Bricouli.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Bricouli.models.DBFiles;

@Repository
public interface DBFilesRepository extends JpaRepository<DBFiles, Long> {

}
