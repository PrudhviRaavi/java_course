import java.lang.*;
import java.util.*;
class ReadKeyboard
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        //next() method is used to read a single word from the keyboard
        //for example if we enter "Hello World" then it will read only "Hello"
        String x=sc.next();
        System.out.println(x);
    }
}