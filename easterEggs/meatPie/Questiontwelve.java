// A java program that print both numbers

  import java.util.Scanner;

 public class Questiontwelve {
  
  public static void main(String[] args)  {
  
    Scanner input = new Scanner(System.in); 

   System.out.println("Enter first number ");

  int firstNumber = input.nextInt();

  System.out.println("Enter second number ");

  int secondNumber = input.nextInt();

  System.out.printf("The first number is: %d\nThe second number is: %d\n", firstNumber, secondNumber );

  }
}
