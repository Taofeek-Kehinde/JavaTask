import java.util.Scanner;


 public class Q11 {

  public static void main(String[] args)  {


  Scanner input = new Scanner(System.in);

 System.out.println("Enter a speed in km/h");

  int speed = input.nextInt();

  if(speed == 0) {

  System.out.println("Slow");
} else if (speed >=1 && speed <= 40) {

 System.out.println("Moderate");

}  else if (speed >= 41 && speed <= 80){

   System.out.println("Fast");

}  else if (speed >= 81 && speed <= 120) {

  System.out.println("Dangerously fast");
} 

}


}
