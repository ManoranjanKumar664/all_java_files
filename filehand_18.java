import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
/*import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;*/

public class filehand_18
{
    public static void main(String []args) throws IOException 
    {
        FileWriter mano1=new FileWriter(".\\file_10.txt");
        mano1.write("hello");
       /* FileReader mano=new FileReader(".\\file_05.txt");
        int i;
        while((i=mano.read())!=-1)
        {
            System.out.print((char)i);
        } */
    }
}