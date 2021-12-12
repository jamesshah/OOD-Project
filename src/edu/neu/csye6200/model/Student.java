package edu.neu.csye6200.model;

import edu.neu.csye6200.Helper;
import java.util.Date;

/**
 * Concrete Student class inherited by abstract Person class.
 * @author james
 *
 */
public class Student extends Person{
	
	private int studentId;
	private Date registrationDate;
	private String address;
	private String guardianName;
	private String guardianEmail;
	private String guardianPhoneNumber; 
	private String guardianAdress;
	private int grade;
	
	public Student(String firstName, String lastName, Date dateOfBirth, int age, int studentId, Date registrationDate, String address, String guardianName, String guardianEmail,
			String guardianPhoneNumber, String guardianAdress, int grade) {
		
		super(firstName, lastName, dateOfBirth, age);
		this.studentId = studentId;
		this.registrationDate = registrationDate;
		this.address = address;
		this.guardianName = guardianName;
		this.guardianEmail = guardianEmail;
		this.guardianPhoneNumber = guardianPhoneNumber;
		this.guardianAdress = guardianAdress;
		this.grade = grade;
	}
	
	public Student(String csvData) {		
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
				csvData.split(",")[9],
				csvData.split(",")[10],
				Integer.parseInt(csvData.split(",")[11])
			);		
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGuardianName() {
		return guardianName;
	}
	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}
	public String getGuardianEmail() {
		return guardianEmail;
	}
	public void setGuardianEmail(String guardianEmail) {
		this.guardianEmail = guardianEmail;
	}
	public String getGuardianPhoneNumber() {
		return guardianPhoneNumber;
	}
	public void setGuardianPhoneNumber(String guardianPhoneNumber) {
		this.guardianPhoneNumber = guardianPhoneNumber;
	}
	public String getGuardianAdress() {
		return guardianAdress;
	}
	public void setGuardianAdress(String guardianAdress) {
		this.guardianAdress = guardianAdress;
	}
		
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName= " + this.getFirstName() + ", lastName= " + this.getLastName() + ", dateOfBirth= " + this.getDateOfBirth() + ", age= " + this.getAge() +  ", registrationDate=" + registrationDate + ", address=" + address
				+ ", guardianName=" + guardianName + ", guardianEmail=" + guardianEmail + ", guardianPhoneNumber="
				+ guardianPhoneNumber + ", guardianAdress=" + guardianAdress + ", grade=" + grade + "]";
	}
	
}
