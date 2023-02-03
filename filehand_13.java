import java.util.Scanner;

class hello1
{
    int a;
    int b;
    void input()
    {
        System.out.println("enter any two number");
        Scanner mano1=new Scanner(System.in);
        a=mano1.nextInt();
        b=mano1.nextInt();
    }
}

class hello2 extends hello1
{
    int c;
    void sum()
    {
        c=a+b;
    }
}

class hello3 extends hello2
{
    void output()
    {
    System.out.println("sum="+c);
    }
}
public class filehand_13
{
    public static void main(String []args)
    {
        hello3 thisobj=new hello3();
        thisobj.input();
        thisobj.output();
    }
}