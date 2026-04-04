// A java program that print the remainder when divided by 2

 import java.util.Scanner;

  public class Questionnineteen {

  public static void main(String[] args)  {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");

    int number = input.nextInt();

    int remain = number % 2;

   System.out.println("Remainder: " + remain);
  }
}
