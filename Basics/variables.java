import java.util.*;

public class variables {

    public static void main(String[] args) {

        int x = 15;
        int y = 10;
        int sum = x + y;
        System.out.println("sum of " + x + " and " + y +" is "+sum);
        // xy
        int prd = x*y;
        System.out.println("product of " + x + " and " + y +" is "+prd);
        // x/y, y/x , x % y
        int v1 = x / y;
        int v2 = y / x;
        int v3 = x % y;
        System.out.println(v1);
        System.out.println(v2);               // / give quotient & % gives remainder
        System.out.println(v3);

        // exp
       // int exp = x * y / x + y;
        // 15*10 / 15 + 10                    JAVA RULES ARE DIFFERENT THAN BODMAS
        // WE CAN ADD BRACKETS TO TO GET OUR REQ VALUES.
        int exp = (x * y) / (x + y);
        System.out.println(exp);

    }

}