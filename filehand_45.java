import java.lang.Thread;
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
        ob1.get();
        ob1.start();
    }
}