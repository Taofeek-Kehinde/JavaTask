import java.util.Scanner;

public class CycleTracker {

    public static void main(String[] args) {
        int choice = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("===== MENSTRUAL CALCULATOR MINI APP ===== \n");
        System.out.println("May 2026 \n");
        
        System.out.println(" S   |    M   |    T   |    W   |    T   |    F   |    S \n ");
        System.out.println(" 1   |    2   |    3   |    4   |    5   |    6   |    7 ");
        System.out.println(" 8   |    9   |    10  |    11  |    12  |    13  |    14 ");
        System.out.println(" 15  |    16  |    17  |    18  |    19  |    20  |    21 ");
        System.out.println(" 22  |    23  |    24  |    25  |    26  |    27  |    28 ");
        System.out.println(" 29  |    30  |    31  | \n");

        System.out.println("Note: This tool should not be used alone to prevent pregnancy.\n");
        System.out.println("How Long Is Your Average Cycle?");

        for (int cycleDay = 5; cycleDay <= 50; cycleDay += 5) {
            System.out.println(cycleDay + " days ");
        }

        System.out.print("Choose your Cycle day: ");
        choice = scan.nextInt();

        if (choice >= 1 && choice <= 9) {
            int cycleLength = choice * 5 + 5; // 1→10, 2→15, 3→20...
            System.out.println(cycleLength + " days");
            System.out.println("Your ovulation day is: " + cycleLength);
        } else {
            System.out.println("Input your cycle date");
        }

        scan.close();
    }
}
