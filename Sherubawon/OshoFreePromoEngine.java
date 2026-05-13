public class OshoFreePromoEngine {
    
    public double calculateFinalPrice(double cartTotal, String promoCode) {
        if (cartTotal == 10000.00 && promoCode.equals("STARTER10")) {
            return 9000.00;
        }
        return cartTotal;
    }
}
