public class Main {

    
    public static int factorial(int Number) {

        int calculateResult = 1;

        for (int count = Number; count >= 1; count--) {
            calculateResult = calculateResult * count;
    System.out.println(count);
        }

        return calculateResult;
    }

    public static void main(String[] args) {

        System.out.println(factorial(5)); 
    }
}
