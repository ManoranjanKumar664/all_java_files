import java.io.File;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

class mano
{
    void get()
    {
        int x, y;
        System.out.println("enter any two number");
        Scanner s1=new Scanner(System.in);
        x=s1.nextInt();
        y=s1.nextInt();
        int a=x+y;
        System.out.println("sum="+a);
    }
}
class ranjan
{
    void show()
    {
        BufferedWriter b1=new BufferedWriter(".\\file15.txt");
        b1.write("hello this is me");
        try{
       b1.flush();
        }
        catch(IOException e)
          {
    
          }
    }
    void mess()
    {
        System.out.println("data inserted");
    }
}

public class filehand_51
{
    public static void main(String []args)
    {
      ranjan r1=new ranjan();
      r1.show();
      r1.mess();
    }
}