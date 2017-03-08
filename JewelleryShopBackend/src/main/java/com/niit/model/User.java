package com.niit.model;

public class User {
	private String id;
	private String name;
	private String password;
	private String mail;
	private String contact;
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
