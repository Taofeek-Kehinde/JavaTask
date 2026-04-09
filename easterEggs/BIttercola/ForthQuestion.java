import java.util.Scanner;

public class ForthQuestion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();
// Check if num1 is = num2 when the remiander is 0
        if (num1 % num2 == 0) {

            System.out.println(num1 + " is a multiple of " + num2);
        } else {
            System.out.println(num1 + " is not a multiple of " + num2);
        }
    }
}
