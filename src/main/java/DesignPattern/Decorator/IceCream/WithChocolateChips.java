package DesignPattern.Decorator.IceCream;

public class WithChocolateChips extends IceCreamBaseFlavorDecorator {

    IceCreamBaseFlavor iceCream;

    public WithChocolateChips(IceCreamBaseFlavor iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " with chocolate Chips";
    }

    @Override
    public double cost() {
        return iceCream.cost() + 0.50;
    }
}
