package control;
import src.*;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import org.bson.Document;

public class registration {
     
    MongoClient mongoClient = MongoClients.create("mongodb+srv://data:2001anand@cluster0.nownt.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
    MongoDatabase database = mongoClient.getDatabase("EApp");
    
    public void closeConnection()
    {
        mongoClient.close();
    }
    
    public String newMeterConnection(userData user)
    {
        MongoCollection<Document> table=database.getCollection("User");
        Document meter=new Document("Meter No","NA").append("Consumer Name",user.getCust_name()).append("Address", user.getAddress()).append("Phone No", user.getPhno()).append("Pincode",user.getPin())
        .append("Family SamagraID", user.getSamgraID()).append("Consumer Aadhar No", user.getAdhrnum()).append("House NOC", user.getHousedet()).append("Meter CA","NO");
        table.insertOne(meter);
        
        return fetchRequestID(user.getCust_name());
    }
    public String fetchRequestID(String name)
    {
        MongoCollection<Document> collection=database.getCollection("User");
        Document doc=collection.find(eq("Consumer Name",name)).first();
        return doc.get("_id").toString();
    }
    
    
}
