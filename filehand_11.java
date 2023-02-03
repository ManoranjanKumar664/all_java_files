import java.io.*;

public class filehand_11
{
    public static void main(String []args) throws IOException
    { 
    
       /* FileWriter mano1=new FileWriter(".\\file_00.txt");
        int x=mano1.read();
        System.out.println(char(x));
        FileWriter mano2=new FileWriter(".\\file_05.txt");
        mano2.write("this is me ");
        mano2.close();*/
        FileReader mano1=new FileReader(".\\file_05.txt");
         int x;
         while(mano1.read()!=-1)
         {
            x=mano1.read();
            System.out.println(x);
         }
       /* for(int i=0;i<a.length();i++)
        {
            System.out.println(a[i]);
        }
    
        while((i=mano1.read())!=-1)
        {
            System.out.println((char)i);
        } */
    }
}