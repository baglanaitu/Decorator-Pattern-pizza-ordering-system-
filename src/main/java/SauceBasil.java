public class SauceBasil extends Decorator {
    public SauceBasil(Interface pizza_interface) {
        super(pizza_interface);
    }
    public int price = 4;

    public String getDescription() {
        return super.getDescription() + "\n+ Basil = " + price + " euro";
    }
    @Override
    public int getPrice() {
        return super.getPrice() + price;
    }
}
