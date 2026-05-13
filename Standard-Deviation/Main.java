public class StandardDeviation {
    public static void main(String[] args) {
        // MY Dataset
        double firstNumber = 5;
        double secondNumber = 10;
        double thirdNumber = 15;
        double fourthNumber = 20;
        double fifthNumber = 25;
        
        // Calculate mean (the average)
        double sumOfAllNumbers = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;
        double totalCount = 5;
        double mean = sumOfAllNumbers / totalCount;
        
        System.out.println("Mean: " + mean);
        System.out.println();
        
        // Calculate differences from THE mean
        double deviation1 = firstNumber - mean;   
        double deviation2 = secondNumber - mean;  
        double deviation3 = thirdNumber - mean;   
        double deviation4 = fourthNumber - mean;  
        double deviation5 = fifthNumber - mean;   
        
        System.out.println("Differences from mean: " + deviation1 + ", " + deviation2 + ", " + deviation3 + ", " + deviation4 + ", " + deviation5);
        
        //  Square each deviation
        double squaredDeviation1 = deviation1 * deviation1;  
        double squaredDeviation2 = deviation2 * deviation2;  
        double squaredDeviation3 = deviation3 * deviation3;  
        double squaredDeviation4 = deviation4 * deviation4;  
        double squaredDeviation5 = deviation5 * deviation5;  
        
        System.out.println("Squared deviations: " + squaredDeviation1 + ", " + squaredDeviation2 + ", " + squaredDeviation3 + ", " + squaredDeviation4 + ", " + squaredDeviation5);
        
        //  Sum of squared deviations
        double sumOfSquaredDeviations = squaredDeviation1 + squaredDeviation2 + squaredDeviation3 + squaredDeviation4 + squaredDeviation5;  
        System.out.println("Sum of squared deviations: " + sumOfSquaredDeviations);
        
        //  Calculate variance (average of squared deviations)
        double variance = sumOfSquaredDeviations / totalCount;  
        System.out.println("Variance: " + variance);
        
        // Calculate standard deviation (square root of variance)
        double standardDeviation = variance / 2;  
        System.out.println("\nFinding square root of " + variance + ":");
        System.out.println("Starting guess: " + standardDeviation);
        
        for (int iteration = 1; iteration <= 5; iteration++) {
            standardDeviation = (standardDeviation + variance / standardDeviation) / 2;
            System.out.println("Iteration " + iteration + ": " + standardDeviation);
        }
        
        System.out.println("\nStandard Deviation: " + standardDeviation);
    }
}
