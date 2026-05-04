import java.util.Arrays;

public class TaskSix {

    public static void main(String[] args) {
        int[] scores = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        
        int[] output = getElements(scores);
        System.out.println("Elements: " + Arrays.toString(output));
        
        int totalSum = getSum(output);
        System.out.println("Sum: " + totalSum);
    }

    public static int[] getElements(int[] arrayNumber) {
        int[] newArrayNumber = new int[5];
        int count = 0;
        for (int loop = 0; loop < arrayNumber.length; loop += 2) {
            newArrayNumber[count] = arrayNumber[loop];
            count++;
        }
        return newArrayNumber;
    }

    public static int getSum(int[] arraySum) {
        int sum = 0;
        for (int number : arraySum) {
            sum += number;
        }
        return sum;
    }
}

