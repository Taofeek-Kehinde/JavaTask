// A java program that print the diffrence between two numbers 
import java.util.Scanner;

  public class Questionfour {
   
   public static void main(String[] args) {
     
  Scanner input = new Scanner(System.in);

     System.out.println("Enter first number");

    int firstNumber = input.nextInt();

 System.out.println("Enter second number");

    int secondNumber = input.nextInt();

    int diff = firstNumber - secondNumber;
  
   System.out.println("The diffrence between the two number is: " +diff);
  
  }
}
