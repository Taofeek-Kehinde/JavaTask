import java.util.Scanner;

public class Palendrome {
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        String num = userInput.next();
        
        char firstLetter = num.charAt(0);
        char lastLetter = num.charAt(num.length() - 1);
        
        if (firstLetter == lastLetter) {
            System.out.println(num + " is a palindrome!");
        } else {
            System.out.println(num + " is NOT a palindrome!");
        }
        
    }
}
