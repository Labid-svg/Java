import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter GPA (letter Grade): ");
        double grade = sc.nextDouble();

        System.out.print("Completed semester? (True/False): ");
        boolean completed = sc.nextBoolean();

        if(completed) {
            if(grade >= 3.5){
                System.out.println("Congratulations! You get a Medal!");
            }
            else{
                System.out.println("No medal for you!");
            }
        }
        else {
            System.out.println("No medal for you!");
        }
    }
}
