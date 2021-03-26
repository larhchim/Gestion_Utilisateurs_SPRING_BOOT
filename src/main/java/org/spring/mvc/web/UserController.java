package org.spring.mvc.web;

import java.util.List;


import org.spring.mvc.entities.UserEntity;
import org.spring.mvc.metier.UserMetierImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	
	@Autowired
	 UserMetierImpl u;
	

	
	@RequestMapping(value="/home")
	public String Home(Model model) 
	{   
	
		
		List<UserEntity> pr =u.listeUser();
	
		model.addAttribute("listeUsers", pr);
		return "Home";
	}
	
	@RequestMapping(value="/remove")
	public String remove(Model model,int id)
	{   
		u.deleteUser(id);
		return "redirect:/home";
	}
	
	@RequestMapping(value="/edit")
	public String edit(Model model,int id)
	{   
		UserEntity ue=u.user(id);
		model.addAttribute("User", ue);
		return "Edit";
	}
	
	@RequestMapping(value="/enrg",method = RequestMethod.POST)
	public String enrg(Model model,UserEntity user)
	{   
		u.modifierUser(user.getIdC(), user);
		return "redirect:/home";
	}

}
