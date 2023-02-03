package thread_package;

import java.lang.Thread;
import java.lang.Runnable;
import java.util.Scanner;

class greeting_class implements Runnable
{
    void greeting_method()
    {
        System.out.println("hello!! I am Ranjan");
    }

    void greeting_hello()
    {
        System.out.println("this is hello greeting");
    }

    public void run()
    {
        greeting_method();
        greeting_hello();
    }
}

class sum_method implements Runnable
{
    void sum_method()
    {
        Scanner mano=new Scanner(System.in);
        System.out.println("enter the first no");
        int a=mano.nextInt();
        int b=mano.nextInt();
        int c=a+b;
        System.out.println("sum="+c);
    }
    public void run()
    {
        sum_method();
    }
}

public class filehand_40
{
    public static void main(String []args)
    {
       greeting_class mano1=new greeting_class();
       Thread t1=new Thread(mano1);
       t1.start();
       sum_method mano2=new sum_method();
       Thread t2=new Thread(mano2);
       t2.start();
   
    }
}