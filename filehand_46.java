import java.io.IOException;
import java.io.File;

class mano
{
    void create() throws IOException
    {
        File f2=new File(".\\file16.txt");
        if(!f2.createNewFile())
        {
            System.out.println("file already present");
        }
    }
}

public class filehand_46
{
    public static void main(String []args) throws IOException
    {
        mano class1=new mano();
        class1.create();
        /*
        //File mano1=new File(".\\file16.txt");
       // mano1.createNewFile();
       File mano=new File(".\\file14.txt");
       if(!mano.createNewFile())
       {
        throw new IOException("file already created");
       }
    
    System.out.println("hello world");
    System.out.println("this is the end of the program");
       */
    }
}