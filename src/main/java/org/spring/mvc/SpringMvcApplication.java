package org.spring.mvc;



import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;

import org.spring.mvc.dao.UserDAOImpl;
import org.spring.mvc.entities.UserEntity;
import org.spring.mvc.metier.UserMetierImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringMvcApplication {
	
	@Autowired
	 UserMetierImpl u;
	


	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringMvcApplication.class, args);
	
	}

	
	
	@PostConstruct
	public void onceFinishedLoading() {
	
	u.ajouterUser(new UserEntity("LARHCHIM","ISMAIL","ismail@gmail.com","rabat"));
		u.ajouterUser(new UserEntity("fadil","kabiri","fadil-kabiri@gmail.com","KENITRA"));
		u.ajouterUser(new UserEntity("MOULOUD","SSGHIRE","mouloud@gmail.com","CASABLANCA"));
		u.ajouterUser(new UserEntity("LARHCHIM","ISMAIL","ismail@gmail.com","rabat"));
		u.ajouterUser(new UserEntity("fadil","kabiri","fadil-kabiri@gmail.com","KENITRA"));
		u.ajouterUser(new UserEntity("MOULOUD","SSGHIRE","mouloud@gmail.com","CASABLANCA"));
		
	}

}
