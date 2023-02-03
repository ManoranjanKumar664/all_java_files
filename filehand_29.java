
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class filehand_29
{
    public static void main(String []args) throws IOException,FileNotFoundException
    {
       /* FileInputStream mano2=new FileInputStream(".\\make.txt");*/
        FileInputStream mano=new FileInputStream(".\\make1.txt");
        FileOutputStream mano2=new FileOutputStream(".\\make3.txt");
        int i;
        while((i=mano.read())!=-1)
        {
            mano2.write((char)i);
        } 
        FileInputStream mano3=new FileInputStream(".\\make3.txt");
        int j;
        while((j=mano3.read())!=-1)
        {
            System.out.print((char)j);
        }
    }
}