import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class filehand_36
{
    public static void main(String []args) throws IOException
    {
        try
        {
          FileOutputStream mano=new FileOutputStream(".\\file07.txt");
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
            try
            {
              FileInputStream mano1=new FileInputStream(".\\file06.txt");
              int a;
              while((a=mano1.read())!=-1)
               {
                System.out.print((char)a);
               }
            }
            catch(FileNotFoundException s)
            {
                System.out.println("no file existed");
            }
        }
    }
}