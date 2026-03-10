package BuilderBaishali;

public class PizzaBuilder {
    private final String size;
    private  boolean cheese = false;
    private  boolean olive = false;
    private  boolean jalapeno = false;
    private  boolean corn = false;
    private  boolean pineapple = false;

    public PizzaBuilder(String size) {
        this.size = size;
    }

    public PizzaBuilder addCheese() {
        this.cheese = true;
        return this;
    }

    public PizzaBuilder addOlive() {
        this.olive = true;
        return this;
    }

    public PizzaBuilder addJalapeno() {
        this.jalapeno = true;
        return this;
    }

    public PizzaBuilder addCorn() {
        this.corn = true;
        return this;
    }

    public PizzaBuilder addPineapple() {
        this.pineapple = true;
        return this;
    }

    public Pizza build() {
        return new Pizza(size, cheese, olive, jalapeno, corn, pineapple);
    }


}
