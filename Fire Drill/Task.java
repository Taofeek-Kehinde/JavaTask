import java.util.Scanner;

public class Task {


public static void main(String[] args) {

Scanner userInput = new Scanner(System.in);

String thief = "";

while (!thief.equals("thief")){

System.out.println("You must be a thief");

System.out.println("Press thief to stop");

thief = userInput.next().toLowerCase().trim();
}

System.out.println("You catch a thief");
}

}

    
