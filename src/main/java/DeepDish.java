public class DeepDish extends Decorator {
    public DeepDish(Interface pizza_interface) {
        super(pizza_interface);
    }
    public int price = 12;
    public String deepDish(){
        return "Deep Dish";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + deepDish();
    }
    @Override
    public int getPrice() {
        return super.getPrice() + price;
    }
}
