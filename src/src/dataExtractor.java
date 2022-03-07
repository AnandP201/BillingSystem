package src;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.ne;
import static com.mongodb.client.model.Projections.include;
import static com.mongodb.client.model.Updates.combine;
import static com.mongodb.client.model.Updates.set;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

public class dataExtractor {
    public String[] meterList;
    public String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
    
    public HashMap<Integer,Document>consumer=new HashMap<>();
    public HashMap<Integer,Document>mBill=new HashMap<>();
    
    
    MongoClient mongoClient = MongoClients.create("mongodb+srv://data:2001anand@cluster0.nownt.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
    MongoDatabase database = mongoClient.getDatabase("EApp");
    
    public void getMeterList()
    {
        MongoCollection<Document> collection=database.getCollection("Meters");
        
    }
    
    public String getBillRate()
    {
        return database.getCollection("Head").find().first().get("Bill Rate").toString();
    }
    
    public String getLatePay()
    {
        return database.getCollection("Head").find().first().get("Late Pay").toString();
    }
    
    public String getConsumerName(String meterID)
    {
        return database.getCollection("Meters").find(eq("Meter No",meterID)).first().get("Consumer").toString();
    }
    public List getDefaultBillValues()
    {
        MongoCollection<Document> c=database.getCollection("Head");   
        Document d=c.find().projection(include("Bill Rate","Late Pay")).first();
        List<String> l= new ArrayList();
        l.add(d.get("Bill Rate").toString());
        l.add(d.get("Late Pay").toString());
        
        return l;
    }
    
    public int updateDefaultBillValues(String bill,String lateBill)
    {
        try
        {
            MongoCollection<Document> c=database.getCollection("Head");
            Bson update=combine(set("Bill Rate",bill),set("Late Pay",lateBill));
            c.findOneAndUpdate(eq("ID","Admin01"), update);
        }
        catch(Exception e)
        {
            return 0;
        }
       return 1;
    }
    
    public HashMap getListOfConsumers(String filter,int unRegFlag)
    {
        MongoCollection<Document>c=database.getCollection("User");
        Bson f=and(ne("Meter CA","INV"),eq("Pincode",filter));
        if(unRegFlag==1){
            f=and(and(ne("Meter CA","INV"),eq("Pincode",filter),eq("Meter No","NA")));
        }
        FindIterable<Document> docI=c.find(f);
        MongoCursor<Document> cursor=docI.iterator();
        int k=0;
        
        while(cursor.hasNext())
        {
            Document d=cursor.next();
            consumer.put(k, d);
            k++;
        }
        return consumer;
    }
    
    public String getCurTimeAndDate()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }
    public HashMap getListOfConsumers(int unRegFlag)
    {
        MongoCollection<Document> c=database.getCollection("User");
        Bson filter=ne("Meter CA","INV");
        if(unRegFlag==1){
            filter=and(eq("Meter No","NA"),ne("Meter CA","INV"));
        }
        FindIterable<Document> docI=c.find(filter);
        MongoCursor<Document> cursor=docI.iterator();
        int k=0;
        while(cursor.hasNext())
        {
            Document d=cursor.next();
            consumer.put(k, d);
            k++;
        }
        return consumer;
    }
    
    public int checkMeter(String meterID)
    {
        MongoCollection<Document> c=database.getCollection("User");
        int count=(int)c.countDocuments(eq("Meter No",meterID));
        if(count==0)
        {
            return 2;
        }
        return 1;
    }
    
    private Document getCreatedFormat()
    {
        Document monthFormat=new Document();
        
        for(int i=2021;i<=2023;i++)
        {
            Document m = new Document();
            for(int j=0;j<12;j++)
            {
                m.append(months[j],new Document("Units Consumed","0").append("Total Amount", "0").append("Late Pay Inc", "NO").append("Paid","NO"));
            }
            monthFormat.append(String.valueOf(i), m);
        }
        
        return monthFormat;
    }
    
    
    public String createBillingDocument(String consumerName,String meterID)
    {
        MongoCollection<Document> c=database.getCollection("Meters");
        String userPassword=generateRandomPassword();
        
        Document userDoc=new Document("Meter No",meterID).append("Consumer", consumerName).append("Password",userPassword);
        
        userDoc.append("Billing", getCreatedFormat()).append("Issued","No new bill issued").append("Due", "No");
        
        c.insertOne(userDoc);
        
        return userPassword;
    }
    
    public String registerMeterConnection(String consumer,String meterID)
    {
        MongoCollection<Document> collection=database.getCollection("User");
        Bson update=combine(set("Meter No",meterID),set("Meter CA","YES"));
        collection.findOneAndUpdate(eq("Consumer Name", consumer),update);
        return createBillingDocument(consumer,meterID);
    }
    
    public String getConsumerJsonID(String consumer)
    {
        MongoCollection<Document> coll=database.getCollection("User");
        Document d=coll.find(eq("Consumer Name",consumer)).first();
        
        return d.get("_id").toString();
    }
    
    
    public int dropMeterConnectionReq(String consumer)
    {
        String txt=JOptionPane.showInputDialog("Application rejection reason");
        
        if(txt!=null)
        {
        String requestID=getConsumerJsonID(consumer);
        MongoCollection<Document> coll=database.getCollection("Status");
      
        Document d=new Document("Request ID",requestID).append("Consumer Name", consumer).append("Reason", txt).append("On",getCurTimeAndDate());
        coll.insertOne(d);
        
        coll=database.getCollection("User");
        Bson update=set("Meter CA","INV");
        coll.updateOne(eq("Consumer Name",consumer), update);
        }
        else
        {
            return 1;
        }
        return 0;
        
    }
    
    
    public String[] getAllMeters()
    {
        
        MongoCollection<Document> coll=database.getCollection("User");
        
        Bson filter=eq("Meter CA","YES");
        
        String[] meterIDs=new String[(int)coll.countDocuments(filter)];
        FindIterable<Document> it=coll.find(filter);
        MongoCursor<Document> mongo=it.iterator();
        int k=0;
        while(mongo.hasNext())
        {
            meterIDs[k]=mongo.next().getString("Meter No");
            k++;
        }
        
        return meterIDs;
    }

    private String generateRandomPassword()
    {
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        
        String values = Capital_chars + Small_chars;
        
        Random method=new Random();
        
        char[] password=new char[8];
        
        for(int i=0;i<8;i++)
        {
            password[i]=(values.charAt(method.nextInt(values.length())));
        }
        return String.valueOf(password);
    }
    
    public int insertIntoBillingDocument(String meterID,String year,String month,String units,String latepay,String amt)
    {
        try
        {
        MongoCollection<Document> co=database.getCollection("Meters");
        String bStr="NO";
        
        if(!latepay.equals("NA"))
        {
            bStr="YES";
        }
        
        String mqselector="Billing."+year+"."+month+".";
        Bson update=combine(set(mqselector+"Units Consumed",units),set(mqselector+"Total Amount",amt),set(mqselector+"Late Pay Inc",bStr),
                set("Issued",getCurTimeAndDate()),set("Due","Pending bill due for "+month+" "+year));
        
        co.findOneAndUpdate(eq("Meter No",meterID), update);
        }
        catch(Exception e)
        {
            return 0;
        }
        
        return 1;
    }
    
    public Document documentOfUser(String meterID)
    {
        return database.getCollection("Meters").find(eq("Meter No",meterID)).first();
    }
    
    public int setPaid(String meterID,String year,String month,String sid,String mode,String units,String amount)
    {
        try
        {
        Bson update=combine(set("Billing."+year+"."+month+"."+"Paid","YES"),set("Due","No"),set("Issued","No new bill issued"));
        database.getCollection("Meters").findOneAndUpdate(eq("Meter No",meterID), update);
        
        Document h=new Document("Meter",meterID).append("Payment SID",sid).append("For", month+" "+year).append("Paid On", getCurTimeAndDate()).append("Units",units).append("Amount",amount).append("Mode",mode);
        database.getCollection("History").insertOne(h);
        }
        catch(Exception e)
        {
            return 0;
        }
        return 1;
        
        
    }
    
    public int updatePassword(String password,String meterID)
    {
        try
        {
            database.getCollection("Meters").findOneAndUpdate(eq("Meter No",meterID), set("Password",password));
        }
        catch(Exception e)
        {
            return 0;
        }
        return 1;
    }
    
    public String getMeterStatus(String id)
    {
        Document doc=database.getCollection("User").find(eq("_id",new ObjectId(id))).first();
        return doc.get("Meter CA").toString();
    }
    
    public Document getReasonForAbortion(String id)
    {
        return database.getCollection("Status").find(eq("Request ID",id)).first();
    }
    
    public String returnMeterIDwithRegID(String id)
    {
        return database.getCollection("User").find(eq("_id",new ObjectId(id))).first().get("Meter No").toString();
    }
    
    public String getConsumerDueString(String meterID){
        return database.getCollection("Meters").find(eq("Meter No",meterID)).first().get("Due").toString();
    }
    
    public String getConsumerBillIssueDate(String meterID){
        return database.getCollection("Meters").find(eq("Meter No",meterID)).first().get("Issued").toString();
    }
    
    public HashMap getHistoryOfUser(String meterID){
        MongoCollection<Document> dcol=database.getCollection("History");
        Bson filter=eq("Meter",meterID);
        
        FindIterable<Document> it=dcol.find(filter);
        MongoCursor<Document> mt=it.iterator();
        int k=0;
        while(mt.hasNext()){
            Document d=mt.next();
            mBill.put(k, d);
            k++;
        }
        return mBill;
    }
}
