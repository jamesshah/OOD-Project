package edu.neu.csye6200.model;

import java.util.Date;

import edu.neu.csye6200.util.Helper;

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
	
	public Teacher(String firstName, String lastName, Date dateOfBirth, int age, int employeeId, Date joiningDate, String address, String phoneNumber, String email, int credits) {		
		super(firstName, lastName, dateOfBirth, age);
		this.employeeId = employeeId;
		this.joiningDate = joiningDate;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.credits = credits;
	}
	
	public Teacher(String csvData) {		
		this(
				csvData.split(",")[0],
				csvData.split(",")[1],
				Helper.getDateFromString(csvData.split(",")[2]), 
				Integer.parseInt(csvData.split(",")[3]),
				Integer.parseInt(csvData.split(",")[4]),
				Helper.getDateFromString(csvData.split(",")[5]),
				csvData.split(",")[6],
				csvData.split(",")[7],
				csvData.split(",")[8],
				Integer.parseInt(csvData.split(",")[9])
			);		
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
		return "Teacher [employeeId=" + employeeId + ", firstName= " + this.getFirstName() + ", lastName= " + this.getLastName()+ ", firstName= " + this.getFirstName() + ", lastName= " + this.getLastName() + ", dateOfBirth= " + this.getDateOfBirth() + ", age= " + this.getAge() + ", joiningDate=" + joiningDate + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + ", email=" + email + ", credits=" + credits + "]";
	}		

}
