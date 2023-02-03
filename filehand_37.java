import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileReader;
import java.io.File;
import java.io.*;

public class filehand_37
{
    public static void main(String []args)  
    {
    
     try{
        FileWriter mano1=new FileWriter(".\\file10.txt", true);
         mano1.write("who are you?");
        mano1.flush();
     } 
     catch(IOException e)
     {
        System.out.println("helow");
     }
       
        //mano1.write("how are you?");
        //mano1.flush();
        
       /* String x="baskey";
        mano1.write(x.getBytes());
        FileReader mano=new FileReader(".\\file07.txt");
        int i;
        while((i=mano.read())!=-1)
        {
            System.out.print((char)i);
        }
        

        FileOutputStream mano=new FileOutputStream(".\\file09.txt");
        String x="9991";
        mano.write(x.getBytes());
        FileInputStream mano2=new FileInputStream(".\\file09.txt");
        int i;
        while((i=mano2.read())!=-1)
        {
            System.out.print((char)i);
        } */
      //  File mano1=new File(".\\file09.txt");
       // mano1.delete();
        
    }
}