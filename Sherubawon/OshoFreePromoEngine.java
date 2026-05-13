public class OshoFreePromoEngine {
    
    public double calculateFinalPrice(double cartTotal, String promoCode) {
        // STARTER10: N5,000 - N14,999
        if (cartTotal >= 5000 && cartTotal <= 14999 && promoCode.equals("STARTER10")) {
            return cartTotal * 0.9;
        }
        // BIGBOY20: N15,000 - N29,999
        if (cartTotal >= 15000 && cartTotal <= 29999 && promoCode.equals("BIGBOY20")) {
            return cartTotal * 0.8;
        }
        // OSHOFREE35: N30,000 and above
        if (cartTotal >= 30000 && promoCode.equals("OSHOFREE35")) {
            return cartTotal * 0.65;
        }
        return cartTotal;
    }
}
