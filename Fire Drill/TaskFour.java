import java.util.Arrays;

public class TaskFour {

public static void main(String[] args) {

int[] scores = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};

int[] output = getElements(scores);

System.out.println(Arrays.toString(output));

}

public static int[] getElements(int[] arrayNumber) {

  int[] newArrayNumber = new int[5];

    int count = 0;

for(int loop = 0; loop<arrayNumber.length; loop +=2) {

    newArrayNumber[count] = arrayNumber[loop];
        count++;

} 

    return newArrayNumber;

    }

}


