package edu.neu.csye6200.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.InsertOneResult;
import com.mongodb.client.result.UpdateResult;

import edu.neu.csye6200.model.Student;
import edu.neu.csye6200.util.DBConn;
import edu.neu.csye6200.util.Helper;
import edu.neu.csye6200.util.StudentFactory;
import static com.mongodb.client.model.Filters.eq;

public class RegistrationController {
	
	SimpleDateFormat format = new SimpleDateFormat("mm-dd-yyyy");
	MongoCollection<Document> studentCollection = DBConn.getInstance().getCollection("Students");
	MongoCollection<Document> groupsCollection = DBConn.getInstance().getCollection("Groups");
	UpdateResult update = null;
	
	@SuppressWarnings("deprecation")
	public boolean enrollStudent(final String fName, final String lName, final String age, final String dob, 
							final String address, final String grdName,final String email, final String phone, final String regDate) {
		
//		Student student = (Student) StudentFactory.getInstance().getObject(fName, lName, Helper.getDateFromString(dob), Integer.parseInt(age), UUID.randomUUID().toString().replace("-", ""), Helper.getDateFromString(regDate), address, grdFName, email, phone, address);
		
		String group = Helper.getStudentGroupId(age);
		if(group == "Invalid age" || group == "")
			return false;			
					
		String randomStudentId = UUID.randomUUID().toString();
		Document student = 
				new Document("firstName", fName)
				.append("lastName", lName)
				.append("age", Integer.parseInt(age))
				.append("studentId", randomStudentId)
				.append("address", address)
				.append("guardianName", grdName)
				.append("guardianEmail", email)
				.append("guardianPhoneNumber", phone)
				.append("group", group);
						
		InsertOneResult result = studentCollection.insertOne(student);
		
		if(result.wasAcknowledged()) {
			UpdateResult update = groupsCollection.updateOne(eq("id", group), Updates.addToSet("students", randomStudentId));
		}
					
		System.out.println(result.getInsertedId().toString());
		
		
		return result.wasAcknowledged() && update.wasAcknowledged();
	}

}
