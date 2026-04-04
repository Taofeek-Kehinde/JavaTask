// Write two numbers and print the product

import java.util.Scanner;

 public class Questionfive {
 
  public static void main(String[] args)  {

  Scanner input = new Scanner(System.in);

   System.out.println("Enter first number "); 
  
   int firstNumber = input.nextInt(); 

   System.out.println("Enter second number "); 
  
   int secondNumber = input.nextInt(); 

   System.out.println("Product: " + (firstNumber * secondNumber));

  }
}
