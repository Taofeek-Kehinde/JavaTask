import java.util.Scanner;

public class SortedNumbers {
    

    public static void displaySortedNumbers(double firstNumber, double secondNumber, double thirdNumber) {
        // Find the largest number
        double largestNumber;
        double middleNumber;
        double smallestNumber;
        
        // to compare to find largest
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            largestNumber = firstNumber;
            if (secondNumber >= thirdNumber) {
                middleNumber = secondNumber;
                smallestNumber = thirdNumber;
            } else {
                middleNumber = thirdNumber;
                smallestNumber = secondNumber;
            }
        }
        else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            largestNumber = secondNumber;
            if (firstNumber >= thirdNumber) {
                middleNumber = firstNumber;
                smallestNumber = thirdNumber;
            } else {
                middleNumber = thirdNumber;
                smallestNumber = firstNumber;
            }
        }
        else {
            largestNumber = thirdNumber;
            if (firstNumber >= secondNumber) {
                middleNumber = firstNumber;
                smallestNumber = secondNumber;
            } else {
                middleNumber = secondNumber;
                smallestNumber = firstNumber;
            }
        }
        
        System.out.println("Numbers in decreasing order: " + largestNumber + " " + middleNumber + " " + smallestNumber);
    }
    
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double firstInput = inputReader.nextDouble();
        
        System.out.print("Enter second number: ");
        double secondInput = inputReader.nextDouble();
        
        System.out.print("Enter third number: ");
        double thirdInput = inputReader.nextDouble();
        
        displaySortedNumbers(firstInput, secondInput, thirdInput);
        
    }
}
