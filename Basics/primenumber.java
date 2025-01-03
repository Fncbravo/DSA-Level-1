import java.util.*;

public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // t ----->  nos passed
        // ex:       t= 5     ====> 5 7 12 11 18 24
        //                            p n  p  n  p        prime/not prime

        // code

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            int count = 0;
            for (int div = 2; div * div <= n; div++) {
                if(n% div ==0){
                    count++;
                    break;
                }
            }

            if(count == 0){
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
                   //  TIME LIMIT EXCEED
            // NOT ONLY YOUR PROGRAM SHOULD BE CORRECT BUT IT ALSO SHOULD BE FAST.
        }

        // WE NEED A SUPERIOR ALGORITHM TO SOLVE THIS

        // SQUARE ROOT METHOD
        // LOGIC IS ANY NUMBER WANTS TO DIVIDE , IT WILL DIVIDE TILL ITS SQUARE ROOT ANYHOW BUT IF IT DOES NOT DIVIDE
        // TILL ITS SQUARE ROOT THEN IT WILL NOT DIVIDE ANY FURTHER.
        // pq = n  then   p > root n & q > root n   XX NOT POSSIBLE, the value of p & q cannot be greater than root n.

        // OPTIMIZATION NO 1 -----   START FROM 2 INSTEAD OF 1 IN DIV
        // IF 1 DIVISION IS DONE YOU DON'T NEED TO DIVIDE IT AGAIN & AGAIN, 1 DIVISION PE HI WE CAN DECLARE IT PRIME
        // AS SOON AS YOU FIND THE FIRST DIVISOR FOR THE NUMBER STOP DOING INTERVISIONS COME OUT OF THE LOOP &
        // SAY IT IS NOT PRIME



    }
}
