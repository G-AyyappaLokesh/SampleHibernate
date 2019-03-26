package com.example.HibernateDemo;

import javax.persistence.Embeddable;

@Embeddable
public class Names {
	
	private String firstname;
	private String lastname;
	private String surname;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	

}
