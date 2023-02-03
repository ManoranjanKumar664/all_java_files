import java.io.*;

public class filehand_07
{
    public static void main(String []args) throws IOException
    {
      //  File mano=new File(".\\dir_01");
      //System.out.println(mano.exists());
      //mano.mkdir();
      //System.out.println(mano.exists());
      File mano2=new File(".\\dir_02");
      if(mano2.exists())
       System.out.println("folder already present");
      else
      {
         mano2.mkdir();
         System.out.println("folder created");
      }
    }
}