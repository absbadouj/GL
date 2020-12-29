package com.demo.Bricouli.services;

import java.util.List;
import java.util.Optional;

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
	public Annonceur addseller(Annonceur a) {
		return annonceurRepository.save(a);
	}
	
	// update to seller 
	public User updatetoseller(Annonceur user, Long id) {
		User u = userRepository.findById(id).get();
		user.setIduser(u.getIduser());
		return userRepository.save(user);
		
	}
	
	// delete user 
	public int deleteuser(Long id) {
		userRepository.deleteById(id);
		return 0;
	}
	
	
	
	
	
}
