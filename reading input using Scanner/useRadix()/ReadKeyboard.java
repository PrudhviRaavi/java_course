import java.lang.*;
import java.util.*;
class ReadKeyboard
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //useRadix() method is used to convert from binary to decimal
        sc.useRadix(2);
        int num = sc.nextInt();
        System.out.println(num);
    }
}