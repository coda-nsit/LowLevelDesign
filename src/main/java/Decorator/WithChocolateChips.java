package Decorator;

public class WithChocolateChips extends IceCreamDecorator{
    IceCream iceCream;
    public WithChocolateChips(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    @Override
    public String getDescription() {
        return iceCream.getDescription();
    }

    @Override
    public double cost() {
        return iceCream.cost() + 0.50;
    }
}
