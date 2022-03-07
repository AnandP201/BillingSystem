package control;
import gui.*;
import java.net.*;
import javax.swing.JOptionPane;

public class EBill
{ 
    static void load(splashScreen Obj)
    {
        Obj.setVisible(true);
        for(int i=0;i<=100;i++)
        {
            try
            {
               Thread.sleep(80);
              
               Obj.l1.setText("Application Loading... "+i+"%");
               Obj.pbar1.setValue(i);
               
               
               
               
               if(i==100)
               {
                   Thread.sleep(500);
                   Obj.setVisible(false);
                   new userlogin().setVisible(true);
               }
            }
            catch(Exception e)
            {
                
              
            }
        }
    }
    
    

public static void main(String[] args) 
{
    try{
               URL url=new URL("https://www.google.com");
               URLConnection connection=url.openConnection();
               connection.connect();
    }
    catch(Exception e){
        new warning1().setVisible(true);
        return;
    }
       splashScreen s=new splashScreen(); 
       load(s);
}
    
}
