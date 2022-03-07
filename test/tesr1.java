import com.mongodb.BasicDBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Projections.elemMatch;
import static com.mongodb.client.model.Projections.exclude;
import static com.mongodb.client.model.Projections.include;
import static com.mongodb.client.model.Updates.set;
import gui.userScreen;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.bson.Document;
import org.bson.conversions.Bson;

public class tesr1 {
    MongoClient mongoClient = MongoClients.create("mongodb+srv://data:2001anand@cluster0.nownt.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
    MongoDatabase database = mongoClient.getDatabase("EApp");
   
    public void find() 
    {
        /**MongoCollection<Document> c=database.getCollection("Meters");
        
        Document d=c.find().first();
        
        Document d1=new Document((Map<String, Object>) d.get("Billing"));
        
        d1.append("2021",new Document("January","200").append("February","250"));
        
        System.out.print(d1);
        
        Document finalDoc=new Document((Map<String, Object>) d1.get("2021"));
        
        System.out.println(finalDoc.get("January"));
       **/
        
        /**Document d1=database.getCollection("Meters").find(eq("Meter No","M101")).first();
        
        Document d2=new Document( (Map<String, Object>) d1.get("Billing"));
        
        Document d3=new Document( (Map<String, Object>) d2.get("2021"));
        
        Document d4=new Document((Map<String, Object>) d3.get("May"));
 
        
        System.out.println(d4.get("Units Consumed"));**/
        
        //System.out.print(database.getCollection("Meters").find(eq("Billing.2021.May.Paid","YES")).first());
        
        //System.out.print(database.getCollection("Meters").find(eq("Meter No","M101")).first().get("Billing.2021"));
        
        
        
    }
    
    public static void main(String args[])throws IOException
    {
        
        
        //System.out.println("60c03bff848fde37f1ca5f4c".length());
           // new tesr1().find();
        new userScreen("M101","Anand","abc","No","yes").setVisible(true);    
        
            //System.out.print(new src.dataExtractor().createBillingDocument("Anand", "M110"));
            
    }
    
}
