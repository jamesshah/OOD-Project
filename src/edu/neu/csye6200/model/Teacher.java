package edu.neu.csye6200.model;

import java.util.Date;

/**
 * Concrete Teacher class inherited from abstract Person class
 * @author james
 *
 */
public class Teacher extends Person{
	
	private int employeeId;
	private Date joiningDate;
	private String address;
	private String phoneNumber;
	private String email;
	private int credits;
	
	public Teacher(String name, Date dateOfBirth, int age, int employeeId, Date joiningDate, String address, String phoneNumber, String email, int credits) {		
		super(name, dateOfBirth, age);
		this.employeeId = employeeId;
		this.joiningDate = joiningDate;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.credits = credits;
	}
	
	

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	@Override
	public String toString() {
		return "Teacher [employeeId=" + employeeId + ", name= " + this.getName() + ", dateOfBirth= " + this.getDateOfBirth() + ", age= " + this.getAge() + ", joiningDate=" + joiningDate + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + ", email=" + email + ", credits=" + credits + "]";
	}		

}
