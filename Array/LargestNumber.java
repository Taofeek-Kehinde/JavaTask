public class Main {

    public static int findLargest(int[] large) {
        int largest = large[0]; 

        if (large[1] > largest) {
            largest = large[1];
        }
        if (large[2] > largest) {
            largest = large[2];
        }
        if (large[3] > largest) {
            largest = large[3];
        }

        return largest;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 9, 2, 7};
        int biggest = findLargest(numbers);
        System.out.println("The largest number: " +biggest); 
    }
}
