package org.spring.mvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.spring.mvc.entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDAOImpl implements UserDAO{
	
	@Autowired
	EntityManager entity;

	@Override
	public List<UserEntity> listeUser() {
		
		Query c=entity.createQuery("FROM UserEntity");
		
		List<UserEntity> ls=c.getResultList();
		
		
		
		return ls;
	}

	@Override
	public UserEntity user(int id) {
		UserEntity u =entity.find(UserEntity.class, id);
		return u;
	}

	@Override
	public void deleteUser(int id) {
		
		entity.remove(entity.find(UserEntity.class, id));
		
	}

	@Override
	public void ajouterUser(UserEntity user) {
		
		entity.persist(user);
		
	}

	@Override
	public void modifierUser(int id, UserEntity user) {
		
		UserEntity o =entity.find(UserEntity.class, id);
		o.setEmail(user.getEmail());
		o.setNom(user.getNom());
		o.setPrenom(user.getPrenom());
		o.setVille(user.getVille());
		
		entity.persist(o);
		
	}

}
