public class Reverse {

    public static String[] reverseArray(String[] reverse) {
        String[] result = new String[3]; 

        result[0] = reverse[2]; 
        result[1] = reverse[1]; 
        result[2] = reverse[0]; 

        return result;
    }

    public static void main(String[] args) {
        String[] reverse = {"1", "2", "3"};
        String[] reversed = reverseArray(reverse);

        System.out.println(reversed[0] + " " + reversed[1] + " " + reversed[2]);
    }
}
