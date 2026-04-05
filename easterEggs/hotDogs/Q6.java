import java.util.Scanner;

public class GratuityCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter subtotal: ");
        double subtotal = scanner.nextDouble();
        System.out.print("Enter gratuity rate (%): ");
        double rate = scanner.nextDouble();

        double gratuity = subtotal * (rate / 100);
        double total = subtotal + gratuity;

        System.out.println("Gratuity: " + gratuity);
        System.out.println("Total: " + total);
    }
}
