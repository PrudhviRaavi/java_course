import java.lang.*;
import java.util.*;
class ReadKeyboard
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter 2 Numbers:");
        x=sc.nextInt();
        y=sc.nextInt();
        z=x+y;
        System.out.println("Sum is: "+z);
    }
}