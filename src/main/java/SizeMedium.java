public class SizeMedium extends Decorator {
    public SizeMedium(Interface pizza_interface) {
        super(pizza_interface);
    }
    public int price = 5;

    @Override
    public String getDescription() {
        return super.getDescription() + " (medium size) = " + getPrice() + " euro";
    }
    @Override
    public int getPrice() {
        return super.getPrice() + price;
    }
}
