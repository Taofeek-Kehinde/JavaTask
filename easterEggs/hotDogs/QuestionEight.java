import java.util.Scanner;

public class QuestionEight.java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter minutes: ");
        long minutes = scanner.nextLong();

        long years = minutes / (365 * 24 * 60);
        long remainingMinutes = minutes % (365 * 24 * 60);
        long days = remainingMinutes / (24 * 60);

        System.out.println(minutes + " minutes = " + years + " years and " + days + " days");
    }
}
