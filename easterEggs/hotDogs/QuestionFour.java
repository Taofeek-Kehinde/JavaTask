//A java program that convert meters to to feet when the value is 3.2786 f i'm using double cuz of .'

import java.util.Scanner;

  public class QuestionFour {

  public static void main(String[] args)  {

 Scanner input = new Scanner(System.in);

  System.out.println("Enter distance in meter");

  double meter = input.nextDouble();

   double feet = meter * 3.2786;

 System.out.println("meter = " + meter + "\n" + "feet= " + feet);

  }
}
