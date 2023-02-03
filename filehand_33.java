import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class filehand_33
{
    public static void main(String []args)
    {
      try{
      FileInputStream mano=new FileInputStream(".\\file01.txt");
      System.out.println("hello world"); 
         }
     catch(FileNotFoundException x)
       {
              System.out.println("file is not readable");
        }
  /*     FileOutputStream mano=new FileOutputStream(".\\file01.txt");
      System.out.println("hello world");  */
    }
}