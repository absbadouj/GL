package com.demo.Bricouli.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Bricouli.models.Annonceur;
import com.demo.Bricouli.models.Avis;
import com.demo.Bricouli.models.User;
import com.demo.Bricouli.services.UsersService;


@RestController
@RequestMapping("/user")
public class UsersController {
	
	@Autowired UsersService usersService;
	
	 @GetMapping("/users")
	 public List<User> getusers(){ 
			return usersService.users();
	 }
	
	 
	
	 @PostMapping("/add")
	    public User postBody(@RequestBody User u) {
	        return usersService.saving(u);
	    }
	 
	 @GetMapping("/users/sellers")
	 public List<Annonceur> getvendeur(){ 
			return usersService.sellers();
	 }
	 
	 @PostMapping("/add/seller")
	    public Annonceur postBody(@RequestBody Annonceur a) {
	        return usersService.addseller(a);
	 }
	 
	 @PostMapping("/update/seller/{id}")
	    public User becomeseller(@RequestBody Annonceur a, @PathVariable Long id) {
	        return usersService.updatetoseller(a,id);
	 }
	 

}
