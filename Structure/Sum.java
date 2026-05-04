import java.util.Scanner;

public class Sum{
    
    public static int sumDigits(int firstDigit, int secondDigit, int thirdDigit) {
        return firstDigit + secondDigit + thirdDigit;
    }
    
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        System.out.print("Enter first digit: ");
        int digitOne = inputCollector.nextInt();
        
        System.out.print("Enter second digit: ");
        int digitTwo = inputCollector.nextInt();
        
        System.out.print("Enter third digit: ");
        int digitThree = inputCollector.nextInt();
        
        int sum = sumDigits(digitOne, digitTwo, digitThree);
        
        System.out.println("Sum of digits: " + sum);
        
    }
}
