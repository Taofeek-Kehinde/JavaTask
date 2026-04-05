import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer (0-1000): ");
        int num = scanner.nextInt();
        
        int sum = (num/100) + (num/10%10) + (num%10);

        System.out.println("Sum of digits: " + sum);
    }
}
