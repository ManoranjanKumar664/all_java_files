import java.io.*;

public class filehand_08
{
    public static void main(String []args) throws IOException
    {
        File mano3=new File(".\\demofile_1");
        if(mano3.exists())
        {
            System.out.println("file already present");
        }
        else
        {
            mano3.createNewFile();
            System.out.println("file created");
        }
    }
}