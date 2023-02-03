import java.util.Scanner;
import java.lang.ArithmeticException;
import java.io.IOException;

public class filehand_21
{
    public static void main(String []args)
    {
        ArithmeticException mano=new ArithmeticException("hello");
       System.out.println(mano.getMessage());
       IOException mano2=new IOException("this is error");
       System.out.println(mano2.getMessage());
    }
}