import java.util.Scanner;

  public class Q29 {

  public static void main(String[] args)  {

    Scanner input = new Scanner(System.in);

   System.out.println("Enter a score (0-100)");

   int Grade = input.nextInt();

    if (Grade >= 90 && Grade <= 100) System.out.println("Grade A");
    else if (Grade >= 80 && Grade <= 89) System.out.println("Grade B");
    else if (Grade >= 70 && Grade <= 79) System.out.println("Grade C");
   else if (Grade >= 60 && Grade <= 69) System.out.println("Grade D");
  else System.out.println("Grade F");

  }
}
