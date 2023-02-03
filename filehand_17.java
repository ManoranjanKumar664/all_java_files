import java.util.Scanner;
import java.io.*;

public class filehand_17
{
    public static void main(String []args) throws IOException
    {
        File mano1=new File("f:\\javafile\\ranjan1.cpp");
        mano1.createNewFile();
        System.out.println(mano1.exists());
    }
}