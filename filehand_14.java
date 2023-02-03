import java.util.Scanner;

class hello3
{
    int a, b, c;
    void input()
    {
        Scanner mano=new Scanner(System.in);
        System.out.println("enter any two number");
        a=mano.nextInt();
        b=mano.nextInt();
        c=a+b;
        System.out.println("sum="+c);
    }
}

public class filehand_14
{
    public static void main(String []args)
    {
    hello3 guy=new hello3();
    guy.input();
    }
}