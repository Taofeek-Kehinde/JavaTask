// A java program that takes 3 numbers and print their average


 import java.util.Scanner;


  public class Questionfourteen {

   public static void main(String[] args)  {
 
    Scanner input = new Scanner(System.in);
    System.out.println("Enter  first number ");

   int firstNumber = input.nextInt();
  
    System.out.println("Enter second number ");

   int secondNumber = input.nextInt();

   System.out.println("Enter the third number ");

   int thirdNumber = input.nextInt();

  int average = (firstNumber + secondNumber + thirdNumber) / 3;

   System.out.println("Average is: " + average);

  }
}
