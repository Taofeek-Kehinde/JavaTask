import java.util.Scanner;

public class RightAngle{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the length of the base (1-10): ");
        int number = input.nextInt();
        
        if (number >= 1 && number <= 10) {
            for (int i = 1; i <= number; i++) {        
                for (int j = 1; j <= i; j++) {      
                    System.out.print("*");
                }
                System.out.println(); 
            }
        } else {
            System.out.println("Enter a number between 1 and 10.");
        }
        
    }
}
