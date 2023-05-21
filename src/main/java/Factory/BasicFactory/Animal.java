package Factory.BasicFactory;

public class Animal implements IAnimal {

    public int numLegs;
    public String name;

    @Override
    public String makeNoise() {
        return "Should be implemented by child classes.";
    }
}
