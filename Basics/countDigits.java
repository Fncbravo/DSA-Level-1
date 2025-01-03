import java.util.*;

public class countDigits {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();

     // every division by 10 strips out the last digit.

        int dig = 0;
        while (n != 0) {                  // e.g    954. 4 will go out and 95 will go back to n.
            n = n / 10;
            dig++;
        }
        System.out.println(dig);
    }
}
