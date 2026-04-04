import java.util.Scanner;

public class radius  {

 public static void main (String[] args)  {

  Scanner input = new Scanner(System.in);

  System.out.println("Enter radius ");

  double radius = input.nextDouble();

  double area = (22/7) * radius * radius;

  System.out.println("Area: " + area);

}
}
