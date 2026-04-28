public class concatenate {
   
    public static String[] combineArrays(String[] firstArray, String[] secondArray) {
        String[] result = new String[6]; // 3 + 3 = 6

        result[0] = firstArray[0];
        result[1] = firstArray[1];
        result[2] = firstArray[2];

        result[3] = secondArray[0];
        result[4] = secondArray[1];
        result[5] = secondArray[2];

        return result;
    }

    public static void main(String[] args) {
        String[] arr1 = {"a", "b", "c"};
        String[] arr2 = {"1", "2", "3"};

        String[] combined = combineArrays(arr1, arr2);

        System.out.println(combined[0] + " " + combined[1] + " " + combined[2] + " " + combined[3] + " " + combined[4] + " " + combined[5]);
    }
}
