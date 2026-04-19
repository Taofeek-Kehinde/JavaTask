// A mile = 1.609344; I google the mile online, so the mile will be multiplied by inputed value 

 import java.util.Scanner;

  public class QuestionOne{

  public static void main(String[] args)  {

  Scanner input = new Scanner(System.in);

//  Since it has a decimal point i choose to use double datatype

  System.out.println("Enter a mile: ");
 
  double miles = input.nextDouble();

   double kilo = 1.609344;

// I want to mulipy the kilo by a mile value which is 1.609344

  double kilometer = miles * kilo;

  System.out.println("Miles = "+  miles + "\n" + "kilometer " + kilometer);
 
   
  } 
}

 


