import java.util.Scanner;
    public class SumOfOddSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
    
        int sum = 0;
        //Using For Loop

        // for(int i = 1; i<=num; i++){
        //     if(i%2 != 0){
        //         sum += i;
        //     }
        // }
        // System.out.println("Sum of Odd Series: " + sum);

        // Using While Loop

        // int i = 1;
        // while(i<=num){
        //     if(i%2 != 0){
        //         sum += i;
        //     }
        //     i++;
        // }
        // System.out.println("Sum of Odd Series: " + sum);

        // Using Do-While Loop

        // int i = 1;
        // do{
        //     if(i%2 != 0){
        //         sum += i;
        //     }
        //     i++;
        // } while(i<=num);

        // System.out.println("Sum of Odd Series: " + sum);

        sc.close();
    }
}

