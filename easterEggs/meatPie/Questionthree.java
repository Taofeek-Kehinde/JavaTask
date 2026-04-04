import java.util.Scanner;

 public class Questionthree {

  public static void main(String[] args) {
  
  Scanner twoNumber = new Scanner(System.in);

   System.out.println("Enter first number ");

   int firstNumber = twoNumber.nextInt();

   System.out.println("Enter second number ");

   int secondNumber = twoNumber.nextInt();

   System.out.println("Sum of two numbers are: " +  (firstNumber + secondNumber));

  }
}
