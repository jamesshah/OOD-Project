package edu.neu.csye6200.controller;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;

import edu.neu.csye6200.util.DBConn;

public class StudentsController {
	
	private static MongoCollection<Document> collection; 
	
//	public StudentsController() {
//		
//	}
	
	public static FindIterable<Document> getStudents(){
		collection = DBConn.getInstance().getCollection("Students");
		return collection.find();
	}
}
