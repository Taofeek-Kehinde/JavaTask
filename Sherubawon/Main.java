import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        OshoFreePromoEngine engine = new OshoFreePromoEngine();
        
        System.out.println("=" .repeat(40));
        System.out.println("  OSHOFREE PROMO ENGINE");
        System.out.println("=" .repeat(40));
        System.out.println();
        
        // Get the cart total from input user
        System.out.print("Enter cart total (₦): ");
        double cartTotal = userInput.nextDouble();
        
        
        userInput.nextLine();
        
        // Get the promo code from user
        System.out.print("Enter promo code: ");
        String promoCode = userInput.nextLine();
        
        System.out.println();
        System.out.println("-".repeat(40));
        
        // Calculate final price
        double finalPrice = engine.calculateFinalPrice(cartTotal, promoCode);
        
        // Display results
        System.out.println("Cart Total: ₦" + cartTotal);
        System.out.println("Promo Code: " + (promoCode.isEmpty() ? "None" : promoCode));
        System.out.println("-".repeat(40));
        
        // Check if discount was applied
        if (finalPrice < cartTotal) {
            double discountAmount = cartTotal - finalPrice;
            double discountPercent = (discountAmount / cartTotal) * 100;
            System.out.println(" Discount Applied!");
            System.out.println("Discount: " + discountPercent + "% (₦" + discountAmount + ")");
        } else {
            System.out.println(" No discount applied");
            if (!promoCode.isEmpty()) {
                System.out.println("  (Invalid promo code or below minimum spend)");
            }
        }
        
        System.out.println("-".repeat(40));
        System.out.println("FINAL PRICE: ₦" + finalPrice);
        System.out.println("=" .repeat(40));
        
    }
}
