 import java.util.Scanner;

 public class Q1 {

  public static void main(String[] args) {

  Scanner input = new Scanner(System.in);

   System.out.println("Enter a number between 1-7");


  int num = input.nextInt();

  if(num == 1 ) {

  System.out.println("violet");

} else if(num == 2 ) 
  System.out.println("indigo");

  else if (num ==3 ) 
   System.out.println("blue");

   else if (num == 4)
   System.out.println("green");
  
   else if (num == 5) 

   System.out.println("yellow");

   else if (num == 6)

   System.out.println("orange");

  else if (num == 7) 

   System.out.println("red");

else {

 System.out.println("Wrong number");
} 


}

}
