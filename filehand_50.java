import java.io.FileReader;
import java.io.FileNotFoundException;

/*class mano1
{
    void go()
    {
        System.out.println("hello everyone");
    }
} */

class mano2 //extends mano1
{
    void go() 
    {
        try
        {
         FileReader mano=new FileReader(".\\file30.txt");
        }
        catch(FileNotFoundException e)
        {
        System.out.println(e.getMessage());
        }
    }
}

public class filehand_50
{
    public static void main(String []args)
    {
        mano2 m=new mano2();
        m.go();
    }
}