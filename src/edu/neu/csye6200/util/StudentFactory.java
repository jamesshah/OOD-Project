package edu.neu.csye6200.util;

import java.util.Date;

import edu.neu.csye6200.model.Person;
import edu.neu.csye6200.model.Student;

/**
 * Concrete StudentFactory class inherited by PersonFactory to create objects of Student class.
 * @author james
 *
 */
public class StudentFactory extends PersonFactory{
	private static StudentFactory studentFactoryInstance;
	
	private StudentFactory() {
		studentFactoryInstance = null;
	}
	
	public static StudentFactory getInstance() {
		if(studentFactoryInstance == null) {
			studentFactoryInstance= new StudentFactory();
		}
		
		return studentFactoryInstance;
	}

	public Person getObject(String firstName, String lastName, Date dateOfBirth, int age, String studentId, Date registrationDate, String address, String guardianName, String guardianEmail,
			String guardianPhoneNumber, String guardianAdress) {		
		return new Student(firstName, 
							lastName, 
							dateOfBirth, 
							age, 
							studentId, 
							registrationDate, 
							address, 
							guardianName, 
							guardianEmail, 
							guardianPhoneNumber, 
							guardianAdress);
	}

	@Override
	public Person getObject(String csvData) {
		return new Student(csvData);
	}		

}
