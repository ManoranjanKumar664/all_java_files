import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.lang.RuntimeException;

class class2 implements Runnable 
{
    void getgo()
    {
        try{
        FileWriter method1=new FileWriter(".\\file15.txt");
        method1.write("this is the getgo");
        method1.flush();
        }
        catch(IOException e)
        {
         System.out.println("hii! this is the getgo");
        }
        
    }
    
    public void run() 
    {
         getgo();
    }
}

public class filehand_43
{ 
 public static void main(String []args)
 {
        class2 mano2=new class2();
        Thread t2=new Thread(mano2);
        t2.start();
        System.out.println("Thread name="+t2.getName()); //give the name of the thread
        System.out.println("id="+t2.getId()); //give the id of the thread
        System.out.println("priority="+t2.getPriority()); //give priority of the thread
        System.out.println("all stack traces="+t2.getAllStackTraces());
        System.out.println("stack trace="+t2.getStackTrace());
        System.out.println("current thread state="+t2.getState());
        System.out.println("thread group="+t2.getThreadGroup());
        System.out.println("context="+t2.getContextClassLoader());
        System.out.println("default uncaught exception handler="+t2.getDefaultUncaughtExceptionHandler());
        System.out.println("uncaught exception handler="+t2.getUncaughtExceptionHandler());
        t2.setPriority(2);
        System.out.println(t2.getPriority());
        System.out.println("current thread="+t2.currentThread());
        System.out.println("thread is alive="+t2.isAlive());
        System.out.println("thraed is daemon="+t2.isDaemon());
        System.out.println("class name="+mano2.getClass());
 }
}