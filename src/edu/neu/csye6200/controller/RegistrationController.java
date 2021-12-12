package edu.neu.csye6200.controller;

import java.util.UUID;

import edu.neu.csye6200.util.Helper;
import edu.neu.csye6200.util.StudentFactory;

public class RegistrationController {
	
	public void enrollStudent(final String fName, final String lName, final String age, final String dob, 
							final String address, final String grdFName, final String grdLName,
							final String email, final String phone, final String regDate) {
		
		StudentFactory.getInstance().getObject(fName, lName, Helper.getDateFromString(dob), Integer.parseInt(age), UUID.randomUUID().toString(), Helper.getDateFromString(regDate), address, grdFName, email, phone, address);
		
		System.out.println("Clicked enroll student " + fName);
		
	}

}
