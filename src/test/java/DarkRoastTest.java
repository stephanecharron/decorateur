import org.junit.Test;

import static org.junit.Assert.*;

public class DarkRoastTest {

    Beverage beverage = new DarkRoast();

    @Test
    public void cost() {
        Double price = beverage.cost();
        Double expectedPrice = 0.99;
        assertEquals(expectedPrice, price);
    }

    @Test
    public void getDescription() {
        String s = beverage.getDescription();
        assertEquals("Dark Roast Coffee", s);

    }


}