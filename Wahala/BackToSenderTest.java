import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BackToSenderTest {

    @Test
    void test80SuccessfulDeliveries() {

        // 80 * 500 + 5000 = 45000
        assertEquals(45000, BackToSender.calculateTotalAmountOfPayment(80));
    }

    @Test
    void testLessThan50() {
        assertEquals(9000, BackToSender.calculateTotalAmountOfPayment(25));
    }

    @Test
    void test50to59() {
        assertEquals(15000, BackToSender.calculateTotalAmountOfPayment(50));
    }

    @Test
    void test60to69() {
        assertEquals(20000, BackToSender.calculateTotalAmountOfPayment(60));
    }
}
