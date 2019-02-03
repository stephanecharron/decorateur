import org.junit.Test;

import static org.junit.Assert.*;

public class EspressoTest {

    Beverage beverage = new Espresso();

    @Test
    public void cost() {
        Double price = beverage.cost();
        Double expectedPrice = 1.99;
        assertEquals(expectedPrice, price);
    }

    @Test
    public void getDescription() {
        String s = beverage.getDescription();
        assertEquals("Espresso", s);

    }
}