import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.lang.Exception;

public class filehand_35
{
    public static void main(String []args)  throws IOException
    {
        try
        {
          FileInputStream mano=new FileInputStream(".\\meme.java");
          int x;
          while((x=mano.read())!=-1)
         {
            System.out.print((char)x);
         }
        }
        catch(FileNotFoundException e)
         {
            try
            {
              FileInputStream baskey=new FileInputStream(".\\meme1.java");
              int j;
              while((j=baskey.read())!=-1)
              {
                System.out.print((char)j);
              }
            }
            catch(FileNotFoundException m)
            {
                System.out.println(m.getMessage());
            }
        }
        /* 
        catch(IOException y)
        {
            System.out.println(y.getMessage());
        } */
       // FileOutputStream mano=new FileOutputStream(".\\meme.java",true);

    }
}