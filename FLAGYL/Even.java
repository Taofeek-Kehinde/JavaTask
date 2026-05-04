import java.util.Scanner;

public class Even {

public static void main (String args[]) {

Scanner inputCollector = new Scanner(System.in);
int count = 0;

while (count < 1 || count > 10){
System.out.println("Enter 1 - 10");
count = inputCollector.nextInt();

if (  count % 2==0) {

    System.out.println(count + "Even number");

} 

 if (count %2 == 1) {

    System.out.println(count + "Odd number");
}

}
}



}
