import java.io.File;
import java.util.Scanner;
import java.lang.Thread;
import java.lang.Runnable;

class mano1 implements Runnable
{
    int totalamt;
    mano1(int x)
    {
       totalamt=x;
    }
   
    public void run()
    {
        synchronized()
        {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the amount to withdraw=");
        int a=sc.nextInt();
        if(totalamt>a)
        {
            totalamt=totalamt-a;
            System.out.println("amont to be withdrawal="+a);
            System.out.println("current balance="+totalamt);
        }
        else
        {
            System.out.println("insufficient amount");
        }
        //System.out.println("enter the withdrawal amout");
        //int a=sc.nextInt();
        }
    }
}

class mano2 implements Runnable
{
    int totalamt;
    mano2(int x)
    {
       totalamt=x;
    }
   
    public void run()
    {
        synchronized(this)
        {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the amount to withdraw=");
        int a=sc.nextInt();
        if(totalamt>a)
        {
            totalamt=totalamt-a;
            System.out.println("amont to be withdrawal="+a);
            System.out.println("current balance="+totalamt);
        }
        else
        {
            System.out.println("insufficient amount");
        }
        //System.out.println("enter the withdrawal amout");
        //int a=sc.nextInt();
        }
    }
}

public class filehand_47
{
    public static void main(String []args)
    {
       mano1 m1=new mano1(2000);
       Thread t1=new Thread(m1);
       mano2 m2=new mano2(2000);
       Thread t2=new Thread(m2);
       t1.start();
       t2.start();
    }
}