package com.java64bit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_login", schema="Tutorials")

public class Login {
	 @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private Long id;
	 @Column(name = "email_id", nullable = false)
	    private String email;
	 @Column(name = "username", nullable = false)
	    private String username;
	 @Column(name = "password", nullable = false)
	    private String password;
	 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	   
		
	    
	   
	   
	   
}
