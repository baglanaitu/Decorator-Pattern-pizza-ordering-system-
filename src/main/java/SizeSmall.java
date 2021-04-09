public class SizeSmall extends Decorator {
    public SizeSmall(Interface pizza_interface) {
        super(pizza_interface);
    }
    public int price = 0;

    @Override
    public String getDescription() {
        return super.getDescription() + " (small size) = " + getPrice() + " euro";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + price;
    }
}
