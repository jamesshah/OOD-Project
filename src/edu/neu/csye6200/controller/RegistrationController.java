package edu.neu.csye6200.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.InsertOneResult;

import edu.neu.csye6200.model.Student;
import edu.neu.csye6200.util.DBConn;
import edu.neu.csye6200.util.Helper;
import edu.neu.csye6200.util.StudentFactory;

public class RegistrationController {
	
	SimpleDateFormat format = new SimpleDateFormat("mm-dd-yyyy");
	MongoCollection<Document> collection = DBConn.getInstance().getCollection("Students");
	
	@SuppressWarnings("deprecation")
	public boolean enrollStudent(final String fName, final String lName, final String age, final String dob, 
							final String address, final String grdFName, final String grdLName,
							final String email, final String phone, final String regDate) {
		
//		Student student = (Student) StudentFactory.getInstance().getObject(fName, lName, Helper.getDateFromString(dob), Integer.parseInt(age), UUID.randomUUID().toString().replace("-", ""), Helper.getDateFromString(regDate), address, grdFName, email, phone, address);
		
		Document student = 
				new Document("firstName", fName)
				.append("lastName", lName)
				.append("age", Integer.parseInt(age))
				.append("studentId", UUID.randomUUID().toString())				
				.append("address", address)
				.append("guardianFirstName", grdFName)
				.append("guardianLastName", grdLName)
				.append("guardianEmail", email)
				.append("guardianPhoneNumber", phone);				
				
		
		InsertOneResult result = collection.insertOne(student);
					
//		System.out.println("Enrolled : " + student);
		System.out.println(result.getInsertedId().toString());
		
		
		return result.wasAcknowledged();
		
	}

}
