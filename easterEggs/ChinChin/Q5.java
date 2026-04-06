import java.util.Scanner;


public class Q5 {

  public static void main(String[] args)  {

    Scanner input = new Scanner(System.in);


   System.out.println("Enter a guess 0 - 1");

   int guess = input.nextInt();


  if(guess == 0) {


  System.out.println("tail");

} else {
   System.out.println("head");
}

   }

}
