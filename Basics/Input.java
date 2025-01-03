import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine() );           // IF want both
        String name = sc.nextLine();

        System.out.println("Dear " + name + "  Here is the Counting");
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }

        // IF ONLY WANT INTEGER USE SCANNER.nextInt();
        // IF WANT STRING USE SCANNER.nextLine();
        // IF WANT BOTH USE INTEGER.PARSEInt(SC.nextLine());

        // OLD METHOD I GUESS BECAUSE IT'S WORKING WITHOUT PARSE STATEMENT


    }
}
