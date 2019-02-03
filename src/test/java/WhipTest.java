import org.junit.Test;

import static org.junit.Assert.*;

public class WhipTest {

    Beverage beverage = new Whip( new Mocha( new Espresso()));

    @Test
    public void cost() {
        Double price = beverage.cost();
        Double expectedPrice = 2.29;
        assertEquals(expectedPrice, price);
    }

    @Test
    public void getDescription() {
        String s = beverage.getDescription();
        assertEquals("Espresso, Mocha, Whip", s);

    }
}