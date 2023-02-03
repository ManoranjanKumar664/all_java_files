 class go extends Thread
 { 
    public void run()
    {
        try
        {
           setName("thread_1");
           System.out.println(getName());
           sleep(2000);
        }
        catch(InterruptedException e)
        {

        }
        System.out.println("ram");
    }
 }
 
public class filehand_49
{ 
   
    public static void main(String []args)
    {
        go mano=new go();
        Thread t=new Thread(mano);
        t.start();
    }
}