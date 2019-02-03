public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    public double cost() {
        return PropertiesUtil.get(this.getClass().getSimpleName());
    }
}