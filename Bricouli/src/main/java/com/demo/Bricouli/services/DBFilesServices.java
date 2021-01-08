package com.demo.Bricouli.services;

import java.io.IOException;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.demo.Bricouli.models.DBFiles;
import com.demo.Bricouli.repositories.DBFilesRepository;

import org.springframework.util.StringUtils;


@Service
public class DBFilesServices {
	
	@Autowired DBFilesRepository dbfilesRepository;
	
	
	public DBFiles storeFile(MultipartFile file) throws IOException {
        // Normalize file name
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        
            // Check if the file's name contains invalid characters
            if(fileName.contains("..")) 
                System.out.println("Sorry! Filename contains invalid path sequence " + fileName);
                
             DBFiles dbFile = new DBFiles(fileName, file.getContentType(), file.getBytes());

            return dbfilesRepository.save(dbFile);
        
    }
	
	public DBFiles getFile(Long fileId) {
        return dbfilesRepository.findById(fileId).get();
                
    }

}
