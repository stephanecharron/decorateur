import org.junit.Test;

import static org.junit.Assert.*;

public class HouseBlendTest {

    Beverage beverage = new HouseBlend();

    @Test
    public void cost() {
        Double price = beverage.cost();
        Double expectedPrice = 0.89;
        assertEquals(expectedPrice, price);
    }

    @Test
    public void getDescription() {
        String s = beverage.getDescription();
        assertEquals("House Blend Coffee", s);

    }
}