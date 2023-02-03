import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class filehand_42
{
    public static void main(String []args) throws IOException, FileNotFoundException
    {
        FileWriter memano=new FileWriter(".\\file13.txt");
        memano.write("this is written through filewriter class");
        memano.flush();
    }
}