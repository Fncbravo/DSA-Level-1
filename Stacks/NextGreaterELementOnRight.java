import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterELementOnRight {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for(int val: a){
            sb.append(val + " ");
        }
        System.out.println(sb);
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] nge = solve(a);
        display(nge);
    }

    public static int[] solve(int[] arr){
        // solve
        int[] nge = new int[arr.length];

        Stack<Integer> st = new Stack<>();

        st.push(arr[arr.length - 1]);
        nge[arr.length - 1] = -1;

        return nge;
    }
}


