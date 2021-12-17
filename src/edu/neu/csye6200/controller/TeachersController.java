package edu.neu.csye6200.controller;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;

import edu.neu.csye6200.util.DBConn;

public class TeachersController {
	
	private static MongoCollection<Document> collection;
	
	public static FindIterable<Document> getTeachers(){
		collection = DBConn.getInstance().getCollection("Teachers");
		return collection.find();
	}

}
