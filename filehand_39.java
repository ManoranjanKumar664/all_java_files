import java.lang.Thread;
import java.lang.Runnable;
import java.util.Scanner;
import java.lang.IllegalThreadStateException;

class ram implements Runnable
{
   
    public void run()
    {
            System.out.println("enter the first no.");
            Scanner mano2=new Scanner(System.in);
            int a=mano2.nextInt();
            int b=mano2.nextInt();
            int c=a+b;
            System.out.println("sum="+c);
            System.out.println("this is the end");
     }   

} 

class hello implements Runnable
{ 
    void get()
    {
        System.out.println("this is the get method");
    }
    public void run()
    {
         get();
    }

}

public class filehand_39
{
    public static void main(String []args) //throws IllegalThreadStateException
    {
        hello ranjan=new hello();
        Thread mano2=new Thread(ranjan); 
        mano2.start();
        ram ranjan2=new ram();
        Thread mano3=new Thread(ranjan2);
        mano3.start();
    }
}