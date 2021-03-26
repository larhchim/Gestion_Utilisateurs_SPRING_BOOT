package org.spring.mvc.entities;


import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Client")
public class UserEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_CLIENT")
	private int idC;
	
	
	@Column(name="NOM")
	private String nom;
	
	
	@Column(name="PRENOM")
	private String prenom;
	
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="VILLE")
	private String ville;

	public UserEntity(String nom, String prenom, String email, String ville) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.ville = ville;
	}
	
	

	public UserEntity() {
		
	}



	public int getIdC() {
		return idC;
	}



	public void setIdC(int idC) {
		this.idC = idC;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getVille() {
		return ville;
	}



	public void setVille(String ville) {
		this.ville = ville;
	}



	@Override
	public String toString() {
		return "UserEntity [nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", ville=" + ville + "]";
	}
	
	
	
	
	


	
	

}
