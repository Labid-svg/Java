import java.util.Scanner;

public class GreatestNumber{
    public static void main(String[] args) {
        // int arr[] = {20,10,30,50,40};

        //User array input

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter How Many Numbers: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i<n; i++){
            System.out.print("Enter Number " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        int max_val = -1;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max_val){
                max_val = arr[i];
            }
        }

        System.out.println("Max Value Of the series is: " + max_val);
    }
}