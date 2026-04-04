// Ask for lenght and width and print area

  import java.util.Scanner;  

  public class Questiontwenty  {
  
  public static void main(String[] args)  {

     Scanner input  = new Scanner(System.in);

    System.out.print("Enter Length: ");

   double Length = input.nextDouble();

   System.out.print("Enter Width: ");

   double Width = input.nextDouble();

    double Area = Length * Width;

   System.out.println("Area is: " + Area);

   
  }
}
