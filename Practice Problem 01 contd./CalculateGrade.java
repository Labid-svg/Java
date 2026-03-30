import java.util.Scanner;

public class CalculateGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: " );
        int num = sc.nextInt();
        if(num >= 0 && num < 40){
            System.out.println("F");
        }
        else if(num >= 40 && num < 60){
            System.out.println("C+");
        }
        else if(num >= 60 && num < 70){
            System.out.println("B");
        }
        else if(num >= 70 && num < 80){
            System.out.println("A-");
        }
        else if(num >= 80 && num < 90){
            System.out.println("A");
        }
        else{
            System.out.println("A+");
        }
        sc.close();
    }
}
