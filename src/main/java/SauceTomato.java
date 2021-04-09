public class SauceTomato extends Decorator {
    public SauceTomato(Interface pizza_interface) {
        super(pizza_interface);
    }
    public int price = 2;

    public String getDescription() {
        return super.getDescription() + "\n+ Tomato sauce = " + price + " euro";
    }
    @Override
    public int getPrice() {
        return super.getPrice() + price;
    }
}
