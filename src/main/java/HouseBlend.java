public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return PropertiesUtil.get(this.getClass().getSimpleName());
    }
}