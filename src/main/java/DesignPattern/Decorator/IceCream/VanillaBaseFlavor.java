package DesignPattern.Decorator.IceCream;

public class VanillaBaseFlavor extends IceCreamBaseFlavor {
    public VanillaBaseFlavor() {
        setDescription("VanillaBaseFlavor");
    }

    @Override
    public double cost() {
        return 1.99;
    }
}