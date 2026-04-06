import java.util.Scanner;


 public class Q9  {

  public static void main(String[] args)  {

   Scanner input = new Scanner(System.in);
System.out.println("Enter first number: ");

  int firstN = input.nextInt();

   System.out.println("Enter second number: ");

  int secNum = input.nextInt();

if ((firstN == 10 && secNum == 15) || (firstN == 25 && secNum == 28) || (firstN == 28 && secNum == 33) || (firstN== 25 && secNum == 15)) {
    System.out.println("You won $10,000");

} else if (firstN == 10 && secNum == 15) {

  System.out.println("YOu won $ 3,000");
} else if (firstN == 10 && secNum == 0) {

  System.out.println("YOu won $1,000");
} else {

  System.out.println("You are a failure, you can never make it u supposed to be cutting grass");
}
   
   }

}
