import lang.stride.*;
import java.util.*;
import java.io.*;

/**
 * 
 */
public class stride_in_option extends master_class
{

    /**
     * Constructor for objects of class stride3
     */
    public stride_in_option()
    {
    }

    /**
     * 
     */
    static public void main()
    {
        Scanner sc =  new  Scanner(System.in);
        System.out.println("HELLO");
        nline("Enter 1 for addition");
        nline("Enter 2 for subtraction");
        nline("Enter 3 for multiplication");
        nline("Enter 4 for division ");
        int a = sc.nextInt();
        nline("Enter 2 numbers:");
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = 0;
        if (a == 1) {
            d = add(b, c);
        }
        else if (a == 2) {
            d = subtract(b, c);
        }
        else if (a == 3) {
            d = multiply(b, c);
        }
        else if (a == 4) {
            d = divide(b, c);
        }
        else {
            System.out.println("WRONG CHOICE");
        }
        System.out.println(d);
    }
}
