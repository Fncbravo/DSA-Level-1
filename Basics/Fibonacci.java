import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {

        /*
        1. You've to print first n fibonacci numbers.
        2. Take as input 'n' the count of fibonacci numbers to print.
        3. Print first n fibonacci numbers.
         */

        // first fibonacci === 0
        // second fibonacci == 1
        // addition of these two are other fibonacci's
        // ex:  0 1 1 2 3 5 8 13 21 34 55
        // what is 10th fibonacci no? ----> 34.

        // write your code here
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
                    /*  METHOD
                    1. Syso(a)
                    2. c = a + b;
                    3. a = b;
                    4. b = c;
                     */
