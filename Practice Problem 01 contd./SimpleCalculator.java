import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number a: ");
        int a = sc.nextInt();
        System.out.print("Enter Number b: ");
        int b = sc.nextInt();

        System.out.print("Enter Operation type(+,-,*,/): ");
        char ch = sc.next().charAt(0);
        if(ch == '+'){
            int answer = a + b;
            System.out.println("Answer: " + answer);
        }
        else if(ch == '-'){
            int answer = a - b;
            System.out.println("Answer: " + answer);
        }
        else if(ch == '*'){
            int answer = a * b;
            System.out.println("Answer: " + answer);
        }
        else if(ch == '/'){
            int answer = a / b;
            System.out.println("Answer: " + answer);
        }
        sc.close();
    }
}
