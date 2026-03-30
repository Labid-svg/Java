import java.util.Scanner;

public class CountOddAndEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter How Many Numbers: ");
        int num = sc.nextInt();

        int[] arr = new int[num];
        int countOdd = 0;
        int countEven = 0;

        for (int i = 0; i < num; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 0) {
                countEven++;
            } else {  
                countOdd++;
            }
        }

        System.out.println("Even: " + countEven);
        System.out.println("Odd: " + countOdd);

        sc.close();  
    }
}