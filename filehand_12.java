import java.io.*;

public class filehand_12
{
    public static void main(String []args) throws IOException
    {
        FileReader mano=new FileReader(".\\file_05.txt");
        while(mano.read()!=-1)
        {
            int x=mano.read();
            System.out.print((char)x);
        }
    }
}