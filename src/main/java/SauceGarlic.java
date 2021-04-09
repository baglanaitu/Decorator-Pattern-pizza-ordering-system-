public class SauceGarlic extends Decorator{
    public SauceGarlic(Interface pizza_interface) {
        super(pizza_interface);
    }
    public int price = 3;

    public String getDescription() {
        return super.getDescription() + "\n+ Garlic = " + price + " euro";
    }
    @Override
    public int getPrice() {
        return super.getPrice() + price;
    }
}
