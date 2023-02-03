import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class filehand_38
{
    public static void main(String []args) 
    {
         int a, b, c;
        Scanner mano=new Scanner(System.in);
        try{
        System.out.println("enter the first value");
        a=mano.nextInt();
        System.out.println("enter the second value");
        b=mano.nextInt();
        c=a+b;
        System.out.println("sum="+c);
        }
        catch(InputMismatchException e)
        {
            System.out.println(e.getMessage());
            System.out.println("enter the value again");
            a=mano.nextInt();
            b=mano.nextInt();
            c=a+b;
            System.out.println("sum="+c);
        
        }
        /*
        try{
        FileWriter mano=new FileWriter(".\\file12.txt",true);
        mano.write("hello man");
        mano.flush();
        mano.close();
        mano.write("I am manoranjan");
        mano.flush();
        }
        catch(IOException a)
        {
            System.out.println(a.getMessage());
        }
        System.out.println("so now the control passed the mission");
        Scanner mano=new Scanner(System.in);
        System.out.println("enter any two no. for demo");

        try{
        int a=mano.nextInt();
        int b=mano.nextInt();
        int c=a+b;
        System.out.println("sum="+c);
        }
        catch(InputMismatchException s)
        {
            System.out.println("enter the right data");
           int x=mano.nextInt();
           int y=mano.nextInt();
           int c=x+y;
           System.out.println("sum="+c);
        }
       */
    }
}