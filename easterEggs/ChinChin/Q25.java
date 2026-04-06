// What i spelled back and stil the same is what we are asked to do here 
import java.util.Scanner;

public class Q25 {

  public static void main(String[] args) {

  Scanner input = new Scanner(System.in);

  System.out.println("Enter first number ");

  int firstNum = input.nextInt();

  System.out.println("Enter second number ");

  int secondNum = input.nextInt();

  System.out.println("Enter third number ");

  int thirdNum = input.nextInt();

  if(firstNum == secondNum  && secondNum == thirdNum) {
 
  System.out.println("Its a palindrome");


} else {
   System.out.println("Not palindrome");

}
  }

  }

