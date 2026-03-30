import java.util.Scanner;

public class OddSeries { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        //Using For Loop

        // for(int i = 1; i<=num; i++){
        //     if(i%2 != 0){
        //         if(i == num){
        //             System.out.println(i);
        //             break;
        //         }
        //         System.out.print(i + ", ");
        //     }
        // }

        // Using While Loop

        // int i = 1;
        // while(i<=num){
        //     if(i%2 != 0){
        //         if(i == num){
        //             System.out.println(i);
        //             break;
        //         }
        //         System.out.print(i + ", ");
        //     }
        //     i++;
        // }

        // Using Do-While Loop

        // int i = 1;
        // do{
        //     if(i%2 != 0){
        //         if(i == num){
        //         System.out.println(i);
        //         break;
        //             }
        //     System.out.print(i + ", ");
        //     }
        //     i++;
        // } while(i<=num);

        sc.close();
    }
}
