import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class filehand_31
{
    public static void main(String []args) 
    {
        FileInputStream mano=new FileInputStream(".\\make3.txt");

        //mano.close();

         int i; 
        while((i=mano.read())!=-1)
        {
            System.out.print((char)i);
        } 
    
    }
}