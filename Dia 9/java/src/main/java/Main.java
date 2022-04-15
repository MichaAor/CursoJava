import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.types.ObjectId;

public class Main {
    public static void main(String[] args) {
        MongoDatabase db = null;
        MongoClient mongoClient = null;
        try {
            mongoClient = new MongoClient( "localhost" , 27017 );

            System.out.println("Connected to MongoDB!");
             db = MongoDatabase("Spotifydb");

        } catch (MongoException e) {
            e.printStackTrace();
        } finally {
            if(mongoClient!=null)
                mongoClient.close();
        }
        DBCollection col = db.getCollection("Spotifydb.SpotifyCol");
        BasicDBObject doc = new BasicDBObject();
        doc.put("name","hi");
        db(doc);



    }
}
