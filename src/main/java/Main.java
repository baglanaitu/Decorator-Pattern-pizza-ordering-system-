public class Main {
    public static void main(String[] args) {
        // First order
        Interface order1 = new SauceBasil(new SauceTomato(new SizeMedium(new Neapolitan(new PizzaDeveloper()))));
        System.out.println(order1.getDescription());
        System.out.println("Total price: " + order1.getPrice() + " euro");

        // Second order
        System.out.println();
        Interface order2 = new SauceWhite(new SauceMozzarella(new SizeBig(new NewYork(new PizzaDeveloper()))));
        System.out.println(order2.getDescription());
        System.out.println("Total price: " + order2.getPrice() + " euro");

        // Third order
        System.out.println();
        Interface order3 = new SauceBasil(new SauceGarlic(new SizeSmall(new DeepDish(new PizzaDeveloper()))));
        System.out.println(order3.getDescription());
        System.out.println("Total price: " + order3.getPrice() + " euro");
    }
}
