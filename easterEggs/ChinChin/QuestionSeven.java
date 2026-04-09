    
  import java.util.Scanner;

public class QuestionSeven {

  public static void main(String[] args)  {

   Scanner input = new Scanner(System.in);

  System.out.println("Enter 0, 1, or 2 ");

  int scissor = input.nextInt();

  System.out.println("Scissor");

  int rock = input.nextInt();

System.out.println("Rock");

  int paper = input.nextInt();

 System.out.println("Paper");

  if (scissor == 0 ) {

   System.out.println("loses");

}  else if ( rock == 1) {

   System.out.println("wins");

} else if  (paper == 2){
  System.out.println("Draw");

} else {

  System.out.println("Wrong input");
}

  }

}
