package DesignPattern.Decorator.IceCream;

public class WithNuts extends IceCreamBaseFlavorDecorator{
    public IceCreamBaseFlavor iceCream;

    public WithNuts(IceCreamBaseFlavor iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " with  raisins and Almonds";
    }

    @Override
    public double cost() {
        return iceCream.cost() + 2.54;
    }
}
