package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id	
	private String id;
	@Column(name="name")
	private String name;
	@Column
	private String password;
	@Column
	private String mail;
	@Column
	private String contact;
	@Column
	private String role;
	
	public String getId() {
		return id;
	}
	public String getContact() {
		return contact;
	}
	public String getMail() {
		return mail;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public String getRole() {
		return role;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setRole(String role) {
		this.role = role;
	}

}
