 import java.util.Scanner;

 public class Q6 {

  public static void main(String[] args) {

 Scanner input = new Scanner(System.in);
 
 System.out.println("Enter a number (N): ");

 int N = input.nextInt();

int sum = 0;

 for(int i =1; i<=N; i++) {

  sum += i;

System.out.println("Sum is " + i + ": " + sum);
}

 System.out.println("TOtal number of sum is: "  + sum);
 
}

}


