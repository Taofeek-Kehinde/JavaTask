import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PizzaWahalaTest {
    
    @Test
    void testCalculateBoxesForOdogwuWith45People() {
        PizzaWahala pizzaApp = new PizzaWahala();
        int boxes = pizzaApp.calculateBoxes("Odogwu", 45);
        assertEquals(4, boxes);
    }

    @Test
    void testCalculateLeftoverSlicesForOdogwuWith45People() {
    PizzaWahala pizzaApp = new PizzaWahala();
    int leftovers = pizzaApp.calculateLeftoverSlices("Odogwu", 45);
    assertEquals(3, leftovers);
}


    @Test 
    void 

}
