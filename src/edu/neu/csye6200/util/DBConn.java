package edu.neu.csye6200.util;

import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class DBConn {
	
	static String uri = "mongodb+srv://daycareUser:R3LHbE6c24vv8nCE@cluster0.kmdpn.mongodb.net/myFirstDatabase?retryWrites=true&w=majority";
    private MongoClient mongoClient;
    private MongoDatabase database;
    
    private static DBConn dbConn = null;
	
    private DBConn() {
		mongoClient = MongoClients.create(uri);
		database = mongoClient.getDatabase("Daycare");
		
		Bson command = new BsonDocument("ping", new BsonInt64(1));
        database.runCommand(command);
        System.out.println("Connected successfully to server.");
	}
    
    public static DBConn getInstance() {
		if(dbConn == null) {
			dbConn= new DBConn();
		}
		
		return dbConn;
	}
	
	@Override
	protected void finalize() throws Throwable {
		mongoClient.close();
	}
	
	public String runCommand(final String collectionName) {
		MongoCollection<Document> collection = database.getCollection(collectionName);
        Document doc = collection.find().first();
        if (doc == null) {
            System.out.println("No results found.");
            return "";
        } else {
            return doc.toJson();
        }
	}
	
}
