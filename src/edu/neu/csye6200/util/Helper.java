package edu.neu.csye6200.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
			docs = collection.find(eq("classId", "06-12"));
			for(Document doc : docs) {
				String[] studentsList = (String[])doc.get("students");
				if(studentsList.length <= 4)
					return doc.get("id").toString();
			}
			return "";
		} else if(ageInt >= 13 && ageInt <= 24) {
			docs = collection.find(eq("classId", "13-24"));
			for(Document doc : docs) {
				String[] studentsList = (String[])doc.get("students");
				if(studentsList.length <= 5)
					return doc.get("id").toString();
			}
			return "";
		} else if(ageInt >= 25 && ageInt <= 35) {
			docs = collection.find(eq("classId", "25-35"));
			for(Document doc : docs) {
				String[] studentsList = (String[])doc.get("students");
				if(studentsList.length >= 6)
					return doc.get("id").toString();
			}
			return "";
		} else if(ageInt >= 36 && ageInt <= 47) {
			docs = collection.find(eq("classId", "36-47"));
			for(Document doc : docs) {
				String[] studentsList = (String[])doc.get("students");
				if(studentsList.length >= 4)
					return doc.get("id").toString();
			}
			return "";
		} else if(ageInt >= 48 && ageInt <= 59) {
			docs = collection.find(eq("classId", "48-59"));
			for(Document doc : docs) {
				String[] studentsList = (String[])doc.get("students");
				if(studentsList.length >= 4)
					return doc.get("id").toString();
			}
			return "";
		} else if(ageInt >= 60) {
			docs = collection.find(eq("classId", "60"));
			for(Document doc : docs) {
				String[] studentsList = (String[])doc.get("students");
				if(studentsList.length >= 15)
					return doc.get("id").toString();
			}
			return "";
		} else {
			return "Invalid age";
		}
	}		
}
