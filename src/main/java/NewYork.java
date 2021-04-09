public class NewYork extends Decorator {
    public NewYork(Interface pizza_interface) {
        super(pizza_interface);
    }
    public int price = 11;
    public String newYork(){
        return "New York";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + newYork();
    }
    @Override
    public int getPrice() {
        return super.getPrice() + price;
    }
}
