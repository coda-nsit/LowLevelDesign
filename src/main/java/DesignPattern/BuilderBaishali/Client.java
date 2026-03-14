package BuilderBaishali;

public class Client {
    public static void main(String[] args) {

        // add
        Pizza pizzaForBaishali = new PizzaBuilder("Medium")
                .addCheese()
                .addCorn()
                .addJalapeno()
                .build();
        System.out.println("Baishali's pizza : " + pizzaForBaishali);

        Pizza pizzaForRishab = new PizzaBuilder("Medium")
                .addCheese()
                .addOlive()
                .addJalapeno()
                .addPineapple()
                .build();
        System.out.println("Rishab's pizza : " + pizzaForRishab);

    }
}
