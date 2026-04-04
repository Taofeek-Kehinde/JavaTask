// Ask for name and age and print it in format

 import java.util.Scanner;

  public class Questiontwentysix {

  public static void main(String[] args)  {

   Scanner input = new Scanner(System.in);

   System.out.println("Enter your name: ");

   String firstName = input.nextLine();

   System.out.println("Enter your age: ");

   int Age = input.nextInt();    

  System.out.printf("I am %s, and i am %d years old%n", firstName, Age);

}
 }

