import java.utils.Arrays;

public class TaskEight {

public static void main(String[] args) {
    int[] scores = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
    int[] output = getElements(scores);

    int min = output[0];

    for (int i = 1; i < output.length; i++) {
        if (output[i] < min) {
            min = output[i];
        }
    }

    System.out.println("Array: " + Arrays.toString(output));
    System.out.println("Minimum: " + min);
}

}





