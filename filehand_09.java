import java.io.*;

public class filehand_09
{
    public static void main(String []args)
    {
        File mano4=new File(".\\newfolder_01");
        if(mano4.exists())
        {
            System.out.println("folder already exists");
        }
        else
        {
            mano4.mkdir();
            System.out.println("folder created");
        }
    }
}