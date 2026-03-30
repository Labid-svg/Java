import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter Number: ");
        // int n = sc.nextInt();

        // int first = 0;
        // int second = 1;

        // System.out.print(first + ", " + second);

        // for(int i = 3; i<=n; i++){
        //     int next = first + second;
        //     System.out.print(", " + next);

        //     first = second;
        //     second = next;
        // }
        // System.out.println();


        // Using Array

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int[] fib = new int[n];

        fib[0] = 0;
        fib[1] = 1;

        for(int i = 2; i<n; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }

        for(int i = 0; i<n; i++){
            System.out.print(fib[i] + ", ");
        }
    }
}
