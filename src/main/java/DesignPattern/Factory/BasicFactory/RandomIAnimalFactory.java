package Factory.BasicFactory;

import java.util.Random;

public class RandomIAnimalFactory implements IAnimalFactory {
    @Override
    public IAnimal createAnimal() {
        Random random = new Random();
        int randomNumber = random.nextInt(3 - 1) + 1;
        if (randomNumber == 1) {
            return new Cat("Catty", 4);
        } else if (randomNumber == 2) {
            return new Dog("Doggy", 4);
        }
        return new Rabbit("Cutie", 4);
    }
}
