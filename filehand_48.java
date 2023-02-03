//import java.lang.Thread;

class go implements Runnable
{
    public void run()
    {
        System.out.println("manoranjan baskey");
    }
}
class hello1 extends Thread
{
    public void run()
    { 
        System.out.println("hello you");
        try{
        Thread.sleep(2000);
        }
        catch(InterruptedException e)
        {

        }
        System.out.println("hello again");
       /* String n=currentThread().getName();
        System.out.println("current thread="+n);
        for(int i=1;i<4;i++)
        {
            System.out.println(i);
            try{
            Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {

            }
        } */
    }
}

class hello2 extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(i);
        }
    }
}
public class filehand_48
{
    public static void main(String []args)
    {
        hello1 mano1=new hello1();
        hello2 mano2=new hello2();
        mano1.setName("thread 1");
        mano2.setName("thread 2");
        mano1.start();
        mano2.start();
       // System.out.println("the name of the thread="+mano1.getName());
        //System.out.println( "the of the second thread="+mano2.getName());
        go mano3=new go();
        Thread t1=new Thread(mano3);
        t1.start();
    }
}