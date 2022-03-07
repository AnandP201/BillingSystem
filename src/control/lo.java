/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import org.bson.Document;
import org.bson.types.Binary;

/**
 *
 * @author hp
 */
public class lo {
    
 
            
    
    public static void main(String args[]){
   
        Runnable runnable=new Runnable(){
        @Override
        public void run() {
            try {
                MongoClient mongoClient = MongoClients.create("mongodb+srv://data:2001anand@cluster0.nownt.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
                MongoDatabase database = mongoClient.getDatabase("Gym");
                
                Binary b=(Binary) database.getCollection("admin").find().first().get("Img");
                
                byte outputBytes[]=b.getData();
                
                URL url=new URL("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Image_created_with_a_mobile_phone.png/1200px-Image_created_with_a_mobile_phone.png");
                 
                BufferedImage out=ImageIO.read(url);
                
                ImageIO.write(out, "png", new File("C:\\Users\\hp\\Desktop\\out1.png"));

                
                ByteArrayInputStream bis = new ByteArrayInputStream(outputBytes);
                BufferedImage bImage2 = ImageIO.read(bis);
                ImageIO.write(bImage2, "jpg", new File("C:\\Users\\hp\\Desktop\\output.jpg") );
                System.out.println("image created");
            } catch (IOException ex) {
                Logger.getLogger(lo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
 
            };
                new Thread(runnable).start();
                }
}
