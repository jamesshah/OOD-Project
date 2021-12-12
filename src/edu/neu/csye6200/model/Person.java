package edu.neu.csye6200.model;

import java.util.Date;

/**
 * Abstract Person class to be inherited by Student and Teacher class. 
 * @author james
 *
 */
public abstract class Person {
	private String name;
	private Date dateOfBirth;
	private int age;
	
	public Person() {}
	
	public Person(String name, Date dateOfBirth, int age) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	

}
