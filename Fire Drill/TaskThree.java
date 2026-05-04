import java.util.Scanner;

public class TaskThree {

public static void main (String args[]) {

Scanner userInput = new Scanner(System.in);

int[] scores = new int[10];

System.out.println("Enter 10 Scores ");


for (int count = 0; count < 10; count++) {

System.out.print("Scores: ");
scores [count] = userInput.nextInt();

}

System.out.println("printing scores horizontally");

for(int score : scores) {

    System.out.print(score + " ");
}


}

    }
