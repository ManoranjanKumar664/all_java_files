import java.lang.Thread;
import java.lang.Runnable;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;

class class2 implements Runnable 
{
    void getgo() 
    {
        System.out.println("heii");
       FileWriter gofile=new FileWriter(".\\file14.txt");
       gofile.write("this is the gofile");
       gofile.flush();
    }
    public void run() throws IOException
    {
        getgo();
    }

}
class class1 implements Runnable
{
  void sum()
  {
    Scanner hello1=new Scanner(System.in);
    System.out.println("enter any two number");
    int a=hello1.nextInt();
    int b=hello1.nextInt();
    int c=a+b;
    System.out.println("sum="+c);
  }
 public void run()
 {
    sum();
 }
}

public class filehand_41
{
    public static void main(String []args) 
    {
        class1 mano1=new class1();
        Thread t=new Thread(mano1);
        t.start();
        class2 mano2=new class2();
        Thread t2=new Thread(mano2);
        try{
        t2.start();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}