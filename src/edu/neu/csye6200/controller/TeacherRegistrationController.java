package edu.neu.csye6200.controller;

import static com.mongodb.client.model.Filters.eq;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.InsertOneResult;
import com.mongodb.client.result.UpdateResult;

import edu.neu.csye6200.util.DBConn;

public class TeacherRegistrationController {
	SimpleDateFormat format = new SimpleDateFormat("mm-dd-yyyy");
	MongoCollection<Document> collection = DBConn.getInstance().getCollection("Teachers");
	MongoCollection<Document> groupsCollection = DBConn.getInstance().getCollection("Groups");
	MongoCollection<Document> credentialsCollection = DBConn.getInstance().getCollection("Credentials");
	
	@SuppressWarnings("deprecation")
	public boolean registerTeacher(final String fName, final String lName, final String age, final Date dob, 
							final String address, final String email, final String phone, final Date regDate) {
		
//		Student student = (Student) StudentFactory.getInstance().getObject(fName, lName, Helper.getDateFromString(dob), Integer.parseInt(age), UUID.randomUUID().toString().replace("-", ""), Helper.getDateFromString(regDate), address, grdFName, email, phone, address);
				
		
		String randomEmployeeId = UUID.randomUUID().toString();
		Document teacher = 
				new Document("firstName", fName)
				.append("lastName", lName)
				.append("age", age)
				.append("employeeId", "teacher" + randomEmployeeId)
				.append("dateOfBirth", dob)
				.append("address", address)								
				.append("emailAddress", email)
				.append("phoneNumber", phone)
				.append("registrationDate", regDate)
				.append("credits", "0");
				
		
		InsertOneResult result = collection.insertOne(teacher);
		
		if(result.wasAcknowledged()) {			
			Document creds = 
					new Document("username", randomEmployeeId)
					.append("password", "pass@123")					
					.append("id", randomEmployeeId)
					.append("role", "teacher");
			InsertOneResult credsRes = credentialsCollection.insertOne(creds);
		}
					
//		System.out.println("Enrolled : " + student);
		System.out.println(result.getInsertedId().toString());
		
		
		return result.wasAcknowledged();
		
	}
}
