 import java.util.Scanner;


  public class QuestionThirty{

  public static void main(String [] args)  {
     Scanner input = new Scanner(System.in);

   System.out.println("Enter the current hour 0-23");

   int hours = input.nextInt();

    if (hours >= 5 && hours <= 11) {

   System.out.println("Good Morning");

}   else if (hours >= 12 && hours <= 17 )

    System.out.println("Good Afternoon");


  else if (hours >= 18 && hours <= 21) 

   System.out.println("Good Evening");

  else if (hours >= 22 && hours <= 4)

 else {
  System.out.println("Wrong input");
}

}


}
