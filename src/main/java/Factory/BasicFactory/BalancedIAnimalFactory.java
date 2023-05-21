package Factory.BasicFactory;

public class BalancedIAnimalFactory implements IAnimalFactory {

    private int numCats;
    private int numDogs;
    private int numRabbits;

    @Override
    public IAnimal createAnimal() {
        if (numCats <= numDogs && numCats <= numRabbits) {
            numCats += 1;
            return new Cat("Catty", 4);
        } else if (numDogs <= numCats && numDogs <= numRabbits) {
            numDogs += 1;
            return new Dog("Doggy", 4);
        }
        numRabbits += 1;
        return new Rabbit("Cutie", 4);
    }
}
