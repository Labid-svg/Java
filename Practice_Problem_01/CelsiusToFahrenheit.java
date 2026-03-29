import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Celsius scale value: ");

        double C = sc.nextDouble();

        double F_Value = (9*C + 160) / 5;

        System.out.print("Fahrenheit Scale Value: " + F_Value);

        sc.close();
    }
}
