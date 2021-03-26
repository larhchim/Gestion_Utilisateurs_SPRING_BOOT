package org.spring.mvc.metier;

import java.util.List;

import org.spring.mvc.dao.UserDAO;
import org.spring.mvc.entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service
public class UserMetierImpl implements UserMetier{

	@Autowired
	private UserDAO us;
	
	public void setUs(UserDAO us) {
		this.us = us;
	}

	@Override
	public List<UserEntity> listeUser() {
		return us.listeUser();
	}

	@Override
	public UserEntity user(int id) {
		return us.user(id);
	}

	@Override
	public void deleteUser(int id) {
		us.deleteUser(id);		
	}

	@Override
	public void ajouterUser(UserEntity user) {
		
		us.ajouterUser(user);
		
	}

	@Override
	public void modifierUser(int id, UserEntity user) {

		us.modifierUser(id, user);
		
	}

}
