import java.util.ArrayList;
import java.util.Scanner;

public class arraylist_02
{
    public static void main(String []args)
    {    
        Scanner s=new Scanner(System.in);
        ArrayList mano1=new ArrayList(4);
       System.out.println(mano1.add(40));
        //mano1.add(Integer.valueOf(s.nextInt()));
       // mano1.add("ranjan");
        mano1.add(50);
        mano1.add(60);
        mano1.add(70);
        mano1.add("ranjan");
      //  System.out.println("removed data="+mano1.remove(1));
        //mano1.remove(0);
        //mano1.add(1, 30);
        ArrayList mano2=new ArrayList(3);
        mano2.add(500);
        mano2.add(600);
        //mano2.add(300);
        //mano2.add(400);
        System.out.println("arraylist  added="+mano1.add(mano2));
        System.out.println("array size="+mano1.size());
        //System.out.println("new data remove at 0="+mano1.remove(0));
        System.out.println("remove value at mano2="+mano1.removeAll(mano2));
        System.out.println("new array size="+mano1.size());
        System.out.println("all elements="+mano1);
    }
}