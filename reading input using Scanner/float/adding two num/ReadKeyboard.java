import java.lang.*;
import java.util.*;
class ReadKeyboard
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        float x,y,z;
        System.out.println("Enter 2 Numbers:");
        x=sc.nextFloat();
        y=sc.nextFloat();
        z=x+y;
        System.out.println("Sum is: "+z);
    }
}