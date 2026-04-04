// A java input to swap numbers


import java.util.Scanner;


 public class Questiontwentyfour{

   public static void main(String[] args)  {

    Scanner input = new Scanner(System.in);

   System.out.println("Enter first number ");

   int firstNumber = input.nextInt();

    System.out.println("Enter second number ");

   int secondNumber = input.nextInt();

    System.out.println("Before swap: first number = " +firstNumber + ", second number = " + secondNumber);
    

  int swap = firstNumber;

   firstNumber = secondNumber;
   secondNumber = swap; 

   System.out.println("After swap: first number = " +firstNumber + ", second number = " + secondNumber);

  }
}
