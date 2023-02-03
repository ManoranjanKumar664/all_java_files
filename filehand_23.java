import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class filehand_23
{
    public static void main(String []args)  
    {
        try{
        BufferedWriter mano=new BufferedWriter( new FileWriter(".\\make2.txt"));
         }//BufferedReader mano=new BufferedReader(new FileReader(".\\file_12.txt"));
        catch(IOException x)
        {
         System.out.println(x.getMessage());
        }
    }
}