package com.example.HibernateDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="Student")// it will create the table with name Student without (name="Student") it will take table name as class name
public class Data {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private Names name;
	@Column(name="Student_Salary")
	private String Salary;
	@Transient //It is a temporary data it will not show in the database
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Names getName() {
		return name;
	}
	public void setName(Names name) {
		this.name = name;
	}
	public String getSalary() {
		return Salary;
	}
	public void setSalary(String salary) {
		Salary = salary;
	}
	
	

}
