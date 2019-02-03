import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SoyTest {

    Beverage beverage = new Soy( new Mocha( new Espresso()));

    @Test
    public void cost() {
        Double price = beverage.cost();
        Double expectedPrice = 2.34;
        assertEquals(expectedPrice, price);
    }

    @Test
    public void getDescription() {
        String s = beverage.getDescription();
        assertEquals("Espresso, Mocha, Soy", s);

    }
}