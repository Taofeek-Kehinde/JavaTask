

 import java.util.Scanner;


  public class QuestionFIve {

   public static void main(String[] args)  {

    Scanner input = new Scanner(System.in);


  System.out.println("Enter a number in square meters: ");

  double square = input.nextDouble();

  double ping = square * 0.3025;

  System.out.println("Sqaure = " + square + "\n"  + "ping = " + ping);
}
}
