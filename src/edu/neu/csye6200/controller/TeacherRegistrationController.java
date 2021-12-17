package edu.neu.csye6200.controller;

import java.text.SimpleDateFormat;
import java.util.UUID;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.InsertOneResult;

import edu.neu.csye6200.util.DBConn;

public class TeacherRegistrationController {
	SimpleDateFormat format = new SimpleDateFormat("mm-dd-yyyy");
	MongoCollection<Document> collection = DBConn.getInstance().getCollection("Teachers");
	
	@SuppressWarnings("deprecation")
	public boolean registerTeacher(final String fName, final String lName, final String age, final String dob, 
							final String address, final String email, final String phone, final String regDate) {
		
//		Student student = (Student) StudentFactory.getInstance().getObject(fName, lName, Helper.getDateFromString(dob), Integer.parseInt(age), UUID.randomUUID().toString().replace("-", ""), Helper.getDateFromString(regDate), address, grdFName, email, phone, address);
				
		Document teacher = 
				new Document("firstName", fName)
				.append("lastName", lName)
				.append("age", Integer.parseInt(age))
				.append("employeeId", "teacher" + UUID.randomUUID().toString())
				.append("address", address)								
				.append("emailAddress", email)
				.append("phoneNumber", phone)
				.append("credits", 0);
				
		
		InsertOneResult result = collection.insertOne(teacher);
					
//		System.out.println("Enrolled : " + student);
		System.out.println(result.getInsertedId().toString());
		
		
		return result.wasAcknowledged();
		
	}
}
