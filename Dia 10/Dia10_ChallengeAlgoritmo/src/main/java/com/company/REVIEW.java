package com.company;

public class REVIEW {
    /*MongoClient mongoClient = MongoClients.create();
List<Document> database = mongoClient.listDatabases().into(new ArrayList<Document>());
//database.forEach(db-> System.out.println(db.toJson()));  //linea para mostrar todas las bdd

MongoDatabase mongoDatabase = mongoClient.getDatabase("challenge10"); //ubico y guardo la bdd
MongoCollection<Document> userData = mongoDatabase.getCollectionSingle("Personas");    //traigo para...ver debajo
Document result = userData.find().first();    //recuperar el primer resultado
//System.out.println(result.toJson());

//mongoDatabase.createCollection("users2");
MongoCollection<Document> userData2 = mongoDatabase.getCollectionSingle("users2");
Document listadInsert = new Document("nombre","Apellido").append("email","email");
userData2.insertOne(listadInsert);
Document result1 = userData2.find().first();
//System.out.println(result1.toJson());

userData2.findOneAndDelete(listadInsert);
MongoCursor<Document> result3 = userData2.find().iterator();
while(result3.hasNext()){
    System.out.println(result3.next().getString("Nombre"));
    System.out.println(result3.next().toJson());                                                              */
}
