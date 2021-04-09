public class SauceWhite extends Decorator {
    public SauceWhite(Interface pizza_interface) {
        super(pizza_interface);
    }
    public int price = 3;

    public String getDescription() {
        return super.getDescription() + "\n+ White sauce = " + price + " euro";
    }
    @Override
    public int getPrice() {
        return super.getPrice() + price;
    }
}
