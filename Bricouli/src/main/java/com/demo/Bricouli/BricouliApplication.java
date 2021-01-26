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
		     registry.addMapping("/user/connexion/{email}/{passe}").allowedOrigins("http://localhost:4200").allowedMethods("GET", "POST","PUT", "DELETE");
		     registry.addMapping("/user/add").allowedOrigins("http://localhost:4200").allowedMethods("GET", "POST","PUT", "DELETE");
		     registry.addMapping("/annonces/afficher").allowedOrigins("http://localhost:4200");
		     registry.addMapping("/annonces/add/{idfile}/service/{id}").allowedOrigins("http://localhost:4200").allowedMethods("GET", "POST","PUT", "DELETE");
		     registry.addMapping("/annonces/afficher/services/user/{id}").allowedOrigins("http://localhost:4200");
		     registry.addMapping("/annonces/{id}").allowedOrigins("http://localhost:4200");
		     registry.addMapping("/devis/add/devis/{iduser}/{idAnnonce}").allowedOrigins("http://localhost:4200");
		     registry.addMapping("/devis/{id}").allowedOrigins("http://localhost:4200");
		     registry.addMapping("/devis/seller/{id}").allowedOrigins("http://localhost:4200");
		     registry.addMapping("/devis/afficher/{id}").allowedOrigins("http://localhost:4200");
		     registry.addMapping("/devis/accepter/devis/{id}").allowedOrigins("http://localhost:4200").allowedMethods("GET", "POST","PUT", "DELETE");
		     registry.addMapping("/devis/envoyer/devis/{id}").allowedOrigins("http://localhost:4200").allowedMethods("GET", "POST","PUT", "DELETE");
		     registry.addMapping("/devis/refuser/devis/{id}").allowedOrigins("http://localhost:4200").allowedMethods("GET", "POST","PUT", "DELETE");
		     registry.addMapping("/passer/{iduser}/{idDevis}").allowedOrigins("http://localhost:4200").allowedMethods("GET", "POST","PUT", "DELETE");
		     registry.addMapping("/commande/passer/{iduser}/{idDevis}").allowedOrigins("http://localhost:4200").allowedMethods("GET", "POST","PUT", "DELETE");
		     registry.addMapping("/commande/afficher/{id}").allowedOrigins("http://localhost:4200").allowedMethods("GET", "POST","PUT", "DELETE");
		     registry.addMapping("/commande/afficher/seller/{id}").allowedOrigins("http://localhost:4200").allowedMethods("GET", "POST","PUT", "DELETE");
		     registry.addMapping("/commande/afficher/user/{id}").allowedOrigins("http://localhost:4200").allowedMethods("GET", "POST","PUT", "DELETE");
		     registry.addMapping("/uploadFile").allowedOrigins("http://localhost:4200").allowedMethods("GET", "POST","PUT", "DELETE");
		     registry.addMapping("/downloadFile/{fileId}").allowedOrigins("http://localhost:4200").allowedMethods("GET", "POST","PUT", "DELETE");
		     registry.addMapping("/commande/terminer/{id}").allowedOrigins("http://localhost:4200").allowedMethods("GET", "POST","PUT", "DELETE");
		     registry.addMapping("/commande/livrer/{id}").allowedOrigins("http://localhost:4200").allowedMethods("GET", "POST","PUT", "DELETE");
		     registry.addMapping("/commande/ajouter/avis/{id}").allowedOrigins("http://localhost:4200").allowedMethods("GET", "POST","PUT", "DELETE");
	      }    
	   		};
			}

}
