import java.lang.*;
import java.util.*;
class ReadKeyboard
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        //nextLine() method is used to read a entire line from the keyboard
        //for example if we enter "Hello World" then it will read "Hello World"
        String x=sc.nextLine();
        System.out.println(x);
    }
}