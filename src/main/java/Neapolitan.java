public class Neapolitan extends Decorator {
    public Neapolitan(Interface pizza_interface) {
        super(pizza_interface);
    }
    public String neapolitan(){
        return "Neapolitan";
    }
    public int price = 10;
    @Override
    public String getDescription() {
        return super.getDescription() + neapolitan();
    }
    @Override
    public int getPrice() {
        return super.getPrice() + price;
    }
}
