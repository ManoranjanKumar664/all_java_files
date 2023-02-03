import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Exception;

public class arraylist_01
{
    public static void main(String []args) throws Exception
    {
        //creating a arraylist named a1
        ArrayList a1=new ArrayList(5);

        //assigning value to arraylist a1
        a1.add(40);
        a1.add(50);
        a1.add(60);
        a1.add(70);

        //showing the value of a1 before calling removeAll() method
        System.out.println("all value of a1="+a1);

        //creating another arraylist named a2
        ArrayList a2=new ArrayList(4);

        //assigning values to arraylist a2
        a2.add(500);
        a2.add(600);
        a2.add(700);
        a2.add(800);

        //showing the values of a2
        System.out.println("value at a2="+a2);

        //size of arraylist a1 before assigning arraylist a2 to arraylist a1
        System.out.println("size of arraylist a1="+a1.size());

        //assigning arraylist a2 to arraylist a1
        a1.add(a2);

        //size of arraylist a1 after assigning arraylist a2 to arraylist a1
        System.out.println("size of the arraylist="+a1.size());

        //values of a1 after assigning a2
        System.out.println("value of a1="+a1);

        //creating a third arraylist a3
        ArrayList a3=new ArrayList(2);
    
       //assigning values to arraylist a3
        a3.add(50);
        a3.add(60);

        //removing the values from arraylist a1 which are present in arraylist a3
        a1.removeAll(a3);
        
        //showing the values of arraylist a1 after removing the values of arraylist a3
        System.out.println("value of a1 after calling removeAll="+a1);

        //removing the values of arraylist a2 from arraylist a1
        a1.remove(a2);

        //showing the values of a1 after removing the values of arraylist a2
        System.out.println("values of a1="+a1);

        //removing again the values of arraylist a2 from arraylist a1
        System.out.println(a1.removeAll(a2));

        //adding 3 values to arraylist a1
        a1.add(80);
        a1.add(90);
        a1.add(100);
        
        //showing the values of arraylist a1
        System.out.println("all new values of a1="+a1);

        //creating new arraylist a4
        ArrayList a4=new ArrayList(2);

        //adding values to arraylist a4
        a4.add(80);
        a4.add(90);

        //retaining the values which are present in arraylist a4 from arraylist a1
        a1.retainAll(a4);
    
        //showing the values of arraylist a1 after retaining the values of arraylist a4
        System.out.println("values after retaining="+a1);
    }
}