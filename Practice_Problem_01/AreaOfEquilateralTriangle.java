import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter arm value: ");

        double arm = sc.nextDouble();

        double area = (Math.sqrt(3)/4) * Math.pow(arm,2);

        System.out.println("Area of a Equilateral Triangle is: " + area);
        sc.close();
    }
}
