package com.demo.Bricouli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class BricouliApplication {
	
	@CrossOrigin("*")

	public static void main(String[] args) {
		SpringApplication.run(BricouliApplication.class, args);
	}
	
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
	   return new WebMvcConfigurerAdapter() {
	      @Override
	      public void addCorsMappings(CorsRegistry registry) {
	    	  
		     registry.addMapping("/user/users").allowedOrigins("http://localhost:4200");
		     registry.addMapping("/user/connexion/{email}/{passe}").allowedOrigins("http://localhost:4200");
		     registry.addMapping("/annonces/afficher").allowedOrigins("http://localhost:4200");
		     registry.addMapping("/annonces/add/service/{id}").allowedOrigins("http://localhost:4200").allowedMethods("GET", "POST","PUT", "DELETE");
		     registry.addMapping("/annonces/afficher/services/user/{id}").allowedOrigins("http://localhost:4200");

		     
	      }    
	   		};
			}

}
