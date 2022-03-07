package sessions;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.combine;
import static com.mongodb.client.model.Updates.set;
import java.util.UUID;
import org.bson.Document;
import org.bson.conversions.Bson;


public class logs {
    
    private String user,sessionID,loginTime;
    private boolean active;
    
    private String genSessionID()
    {
        return UUID.randomUUID().toString();
    }
    public logs(){}

    public String getUser() {
        return user;
    }
    public logs(String user)
    {
       this.user=user;
       this.sessionID=genSessionID();
       activeSession(); 
       this.loginTime=java.time.LocalTime.now().toString();
    }
    
    public String getSessionID()
    {
        return this.sessionID;
    }
    
    private void activeSession()
    {
        this.active=true;
    }
    
    public void addToActive()
    {
        MongoClient mongoClient = MongoClients.create("mongodb+srv://data:2001anand@cluster0.nownt.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("EApp");
    
        Document aDoc=new Document("User",this.user).append("Session ID", this.sessionID).append("Login Time",new src.dataExtractor().getCurTimeAndDate()).append("Active", this.active);
        
        database.getCollection("Sessions").insertOne(aDoc);
    }
    
    public void setUnActive(String session)
    {
        MongoClient mongoClient = MongoClients.create("mongodb+srv://data:2001anand@cluster0.nownt.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("EApp");
        
        Bson update=combine(set("Logout Time",new src.dataExtractor().getCurTimeAndDate()),set("Active","False"));
        
        database.getCollection("Sessions").findOneAndUpdate(eq("Session ID",session), update);
    }
    
}
