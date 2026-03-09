package Decorator;

public class WithNuts extends IceCreamDecorator{
    public IceCream iceCream;
    public WithNuts(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    @Override
    public String getDescription() {
        return iceCream.getDescription();
    }

    @Override
    public double cost() {
        return iceCream.cost() + 2.54;
    }
}
