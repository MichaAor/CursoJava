package com.company;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoDBSingleton {
	private static MongoDBSingleton mDbSingleton;
	private static MongoClient mongoClient = new MongoClient();
	private static MongoDatabase baseDatos = mongoClient.getDatabase("challenge10");

	private static MongoCollection<Document> personasData = baseDatos.getCollection("Personas");


	
	private MongoDBSingleton() {
	}
	
	public static MongoDBSingleton getInstance() {
		if(mDbSingleton==null) {
			mDbSingleton = new MongoDBSingleton();
		}
		return mDbSingleton;
	}


	public static MongoCollection<Document> getCollectionSingle() {
		return personasData;
	}
}
