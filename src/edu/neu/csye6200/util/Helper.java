package edu.neu.csye6200.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;

public class Helper {	
	
	public static Date getDateFromString(String dateString) {
		SimpleDateFormat dateFormat =new SimpleDateFormat("MM/dd/yyyy");
		try {
			return dateFormat.parse(dateString);
		} catch (ParseException e) {
			System.err.println("Please provide Date in MM/dd/yyyy format only.");
			e.printStackTrace();
		}
		return null;
	}
	
	public static String getStudentGroupId(String age) {
		int ageInt = Integer.parseInt(age);
		FindIterable<Document> docs = null;
		
		MongoCollection<Document> collection = DBConn.getInstance().getCollection("Groups");
		
		if(ageInt >= 6 && ageInt <= 12) {						
			return "06-12-0" + new Random().nextInt(3);
		} else if(ageInt >= 13 && ageInt <= 24) {			
			return "13-24-0" + new Random().nextInt(5);
		} else if(ageInt >= 25 && ageInt <= 35) {
			return "25-35-0" + new Random().nextInt(6);
		} else if(ageInt >= 36 && ageInt <= 47) {
			return "36-47-0" + new Random().nextInt(8);
		} else if(ageInt >= 48 && ageInt <= 59) {
			return "48-59-0" + new Random().nextInt(12);
		} else if(ageInt >= 60) {			
			return "60-0" + new Random().nextInt(15);
		} else {
			return "Invalid age";
		}
	}		
}
