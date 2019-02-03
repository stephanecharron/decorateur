public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return PropertiesUtil.get(this.getClass().getSimpleName());
    }
}