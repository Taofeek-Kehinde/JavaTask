import java.util.Scanner;

public class TwentyQuestion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter grade (A-F): ");

        String grade = input.next();

        if (grade == "A") {
            System.out.println("GPA: 4.0");
        } else if (grade == "B") {
            System.out.println("GPA: 3.0");
        } else if (grade == "C") {
            System.out.println("GPA: 2.0");
        } else if (grade == "D") {
            System.out.println("GPA: 1.0");
        } else if (grade == "F") {
            System.out.println("GPA: 0.0");
        } else {
            System.out.println("Error: Invalid grade");
        }
    }
}
