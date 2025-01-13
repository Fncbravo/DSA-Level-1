import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        // write your code here

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i == j) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
