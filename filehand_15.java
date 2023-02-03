import java.util.Scanner;

class master1
{
    void show1()
    {
        System.out.println("this method is from class master1");
    }
}

class master2 extends master1
{
    void show2()
    {
        System.out.println("this method is from class master2");
    }
}

class master3 extends master2
{
    void show3()
    {
        System.out.println("this method is from class master3");
    }
}

public class filehand_15
{
    public static void main(String []args)
    {
        master3 mano=new master3();
        mano.show1();
        mano.show2();
        mano.show3();
    }
}