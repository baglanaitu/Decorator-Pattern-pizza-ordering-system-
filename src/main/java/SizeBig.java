public class SizeBig extends Decorator {
    public SizeBig(Interface pizza_interface) {
        super(pizza_interface);
    }
    public int price = 10;

    @Override
    public String getDescription() {
        return super.getDescription() + " (big size) = " + getPrice() + " euro";
    }
    @Override
    public int getPrice() {
        return super.getPrice() + price;
    }

}
