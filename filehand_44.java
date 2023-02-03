import java.lang.Thread;
import java.lang.Runnable;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

class hello2 implements Runnable
{
    void file_creation() throws IOException
    {
        File f1=new File(".\\file14.txt");
        f1.createNewFile();
        if(f1.exists())
        {
            System.out.println("file created");
        }
        else
        {
            System.out.println("file not created");
        }
    }
    void show10()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println(i);
        }
    }
    public void run() 
    {
        show10();
        try{
        file_creation();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
class hello1 implements Runnable
{
    void show20()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }
    }
    void get()
    {
        Scanner mano1=new Scanner(System.in);
        System.out.println("enter the first no.");
        int m=mano1.nextInt();
        System.out.println("enter the second on.");
        int n=mano1.nextInt();
        int o=m+n;
        System.out.println("sum="+o);
    }
   
    void take()
    {
        System.out.println("now it is over");
    }
    public void run()
    {
        get();
        show20();
        take();
        System.out.println("hello boys! this is the first line");
    }
}

public class filehand_44
{
    public static void main(String []args)
    {
        hello1 go=new hello1();
        Thread hellomano=new Thread(go);
        hellomano.start();
        hello2 go1=new hello2();
        Thread hellomano2=new Thread(go1);
        hellomano2.start();
    }
}
/*import java.lang.Thread;
import java.util.Scanner;

class mano extends Thread
{
    void get()
    {
        Scanner mano1=new Scanner(System.in);
        int x=mano1.nextInt();
        int y=mano1.nextInt();
        int z=x+y;
        System.out.println("sum="+z);
    }
    void sum()
    {
        int a=5;
         int b=30;
         int c=a+b;
         System.out.println("sum="+c);
    }
    public void run()
    {
        sum();
        get();
    }
}

public class filehand_44
{
    public static void main(String []args)
    {
        mano ob1=new mano();
        ob1.start();
    }
} */