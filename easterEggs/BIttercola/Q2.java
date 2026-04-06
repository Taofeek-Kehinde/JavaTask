  import java.util.Scanner;


  public class Q2 {

  public static void main(String[] args)  {

   Scanner input = new Scanner(System.in);


  System.out.println("Enter a 5 digit number");

   System.out.println("Enter first number");

  int num1 = input.nextInt();

   System.out.println("Enter second number");

  int num2 = input.nextInt();

   System.out.println("Enter third number");

  int num3 = input.nextInt();

   System.out.println("Enter forth number");

  int num4 = input.nextInt();

  System.out.println("Enter last number");

  int num5 = input.nextInt();

  int sum = num1 + num5;

  System.out.println("The sum of First and last digit is: " + sum);

   }

}
