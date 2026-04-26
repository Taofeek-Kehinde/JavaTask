public class BackToSender {

    public static int calculateTotalAmountOfPayment(int deliveries){

        int basePay = 5000;
        int rate;

        double percentage = (deliveries / 100.0) * 100;

        if(percentage < 50) {

            rate = 160;

        } else if(percentage < 60){

            rate = 200;

        } else if (percentage < 70) {

            rate = 250;

        } else {

            rate = 500;

        }

        return (deliveries * rate) + basePay;
    }
}
