import java.util.Scanner;

class thisfile1
{
    int a, b;
    void take()
    {
    Scanner mano=new Scanner(System.in);
    System.out.println("enter any two number");
    a=mano.nextInt();
    b=mano.nextInt();
    }
}

class thisfile2 extends thisfile1
{
    int c;
    void sum()
    {
        c=a+b;
    }
}

class thisfile3 extends thisfile2
{
    void show()
    {
    System.out.println("sum="+c);
    }
}

public class filehand_16
{
    public static void main(String []args)
    {
        thisfile3 gogo=new thisfile3();
        gogo.take();
        gogo.sum();
        gogo.show();
    }
}