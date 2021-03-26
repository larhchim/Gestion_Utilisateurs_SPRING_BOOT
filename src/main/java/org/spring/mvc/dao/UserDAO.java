package org.spring.mvc.dao;

import java.util.List;

import org.spring.mvc.entities.UserEntity;

public interface UserDAO {
	
	public List<UserEntity> listeUser();
	
	public UserEntity user(int id);
	
	public void deleteUser(int id);
	
	public void ajouterUser(UserEntity user);
	
	public void modifierUser(int id,UserEntity user);
	

}
