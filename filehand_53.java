import java.util.Scanner;
class mano1
{
    void show()
    {
        System.out.println("hello! this is the parent class");
    }
    void take()
    {
        System.out.println("go to hell");
    }
}

class mano
{
    void input_data()
    {
        Scanner s1=new Scanner(System.in);
        int a=s1.nextInt();
        int b=s1.nextInt();
        int c=a+b;
        System.out.println("sum of the two number="+c);
    }
    
    mano1 m1=new mano1(){
        int this_child=500;
        public void show()
        {
            System.out.println("this is the child classs"+this_child);
        }
        public void take()
        {
            System.out.println("this is the take method");
        }
    };
}

public class filehand_53
{
    int var_01=30;
    int var_02=300;
    int c=var_01+var_02;
    void show_sum()
    {
        System.out.println("sum="+c);
    }

    static void fun1()
    {
        System.out.println("this is the function inside filehand_53");
    }

    void fun2()
    {
        System.out.println("this is the fun2");
    }

    public static void main(String []args)
    {
        mano ob1=new mano();
        ob1.m1.show();
        ob1.m1.take();
        filehand_53.fun1();
        filehand_53 ob2=new filehand_53();
        ob2.fun2();
        ob2.show_sum();
    }
}