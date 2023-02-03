import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class filehand_30
{
    public static void main(String []args) throws IOException
    {
        FileInputStream mano=new FileInputStream(".\\make3.txt");
        //mano.close();
        try
        {
        int i;
        while((i=mano.read())!=-1)
        {
            System.out.print((char)i);
        } 
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}