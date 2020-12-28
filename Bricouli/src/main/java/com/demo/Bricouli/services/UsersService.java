package com.demo.Bricouli.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Bricouli.models.Annonceur;
import com.demo.Bricouli.models.Avis;
import com.demo.Bricouli.models.User;
import com.demo.Bricouli.repositories.AnnonceurRepository;
import com.demo.Bricouli.repositories.AvisRepository;
import com.demo.Bricouli.repositories.UserRepository;

@Service
public class UsersService {
	
	@Autowired UserRepository userRepository;
	@Autowired AnnonceurRepository annonceurRepository;
	
	
	// get users 

	public List<User> users(){
		return userRepository.findAll();
	}
	
	// add user
	
	public User saving(User u){
		return userRepository.save(u);
	}
	
	// get sellers 
	
	public List<Annonceur> sellers(){
		return annonceurRepository.findAll();	
	}
	
	// add sellers
	public Annonceur addseller(Annonceur a, User u) {
		userRepository.save(u);
		Long id = u.getIduser();
		a.setIduser(id);
		return annonceurRepository.save(a);
	}
	
}
