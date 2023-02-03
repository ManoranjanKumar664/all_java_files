import java.io.*;

public class filehand_06
{
    public static void main(String []args) throws IOException
    {
        File mano=new File(".\\ranjan_01.txt");
        mano.createNewFile();
       System.out.println(mano.exists());
       System.out.println(mano.canRead());
       System.out.println(mano.canWrite());
       mano.delete();
       System.out.println(mano.exists());
    }
}