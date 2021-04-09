public class Decorator implements Interface {
    Interface pizza_interface;

    public Decorator(Interface pizza_interface) {
        this.pizza_interface = pizza_interface;
    }

    public int getPrice(){return pizza_interface.getPrice();}
    public String getDescription() {
        return pizza_interface.getDescription();
    }
}
