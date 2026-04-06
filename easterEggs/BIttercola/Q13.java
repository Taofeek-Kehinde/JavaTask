import java.util.Scanner;


 public class Q13  {

   public static void main(String[] args) {

  Scanner input = new Scanner(System.in);

 System.out.println("Enter birth year");

  int year = input.nextInt();

  if(year < 65)  {

  System.out.println("You are not eligible");
}  else {

  System.out.println("You are eligible");
}

}
}
