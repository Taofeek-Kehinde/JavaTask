import java.util.Scanner;


  public class Q26 {

  public static void main(String[] args) {

   Scanner input = new Scanner(System.in);
   
    System.out.println("Enter a pin ");
   

   int pin = input.nextInt();

  int Balance = 1000;

   if(pin == 1234) {

    System.out.println("Balance is: " + "$"+Balance);

} else {

  System.out.println("Wrong pin");
}

   }
}
