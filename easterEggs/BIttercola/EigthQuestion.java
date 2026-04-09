import java.util.Scanner;


 public class EigthQuestion{

  public static void main(String[] args) {

  Scanner input = new Scanner(System.in);

  System.out.println("Enter 4 digit pin ");
 
 int pin = input.nextInt();

  if(pin >= 1000 && pin <= 9999){

  System.out.println("Valid pin");
}  else {

  System.out.println("Invalid pin");
}

}

}
