// % means the remainder

import java.util.Scanner;

  public class Q27  {

  public static void main(String[] args)  {

  Scanner input = new Scanner(System.in);

  System.out.println("Enter an integer value");
  int num = input.nextInt();


      System.out.println("Is " + num + " divisible by 2? " + (num % 2 == 0));
        System.out.println("Is " + num + " divisible by 3? " + (num % 3 == 0));
        System.out.println("Is " + num + " divisible by 5? " + (num % 5 == 0));
        System.out.println("Is " + num + " divisible by 7? " + (num % 7 == 0));

}


}
