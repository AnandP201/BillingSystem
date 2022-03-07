package control;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;
import org.bson.Document;

import sessions.logs;

public class login {
    MongoClient mongoClient = MongoClients.create("mongodb+srv://data:2001anand@cluster0.nownt.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
    MongoDatabase database = mongoClient.getDatabase("EApp");
    MongoCollection<Document> c;
    int count;
    
    public int login(String ID,String password,String userType)
    {
        if(userType.equals("C"))
        {
            c=database.getCollection("Meters");
            count=(int)c.countDocuments(and(eq("Meter No",ID),eq("Password",password)));
        }
        else
        {
            c=database.getCollection("Head");
            count=(int)c.countDocuments(and(eq("ID",ID),eq("Password",password)));
        }
        if(count>0)
        {
            return 1;
        }
        return 0;
    }
    
}
