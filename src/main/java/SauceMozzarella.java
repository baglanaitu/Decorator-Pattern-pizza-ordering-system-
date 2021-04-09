public class SauceMozzarella extends Decorator {
    public SauceMozzarella(Interface pizza_interface) {
        super(pizza_interface);
    }
    public int price = 5;

    public String getDescription() {
        return super.getDescription() + "\n+ Mozarella = " + price + " euro";
    }
    @Override
    public int getPrice() {
        return super.getPrice() + price;
    }
}
