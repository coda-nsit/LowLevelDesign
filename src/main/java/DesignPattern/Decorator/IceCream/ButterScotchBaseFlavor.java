package DesignPattern.Decorator.IceCream;

public class ButterScotchBaseFlavor extends IceCreamBaseFlavor {

    public ButterScotchBaseFlavor() {
        setDescription("ButterScotchBaseFlavor");
    }

    @Override
    public double cost() {
        return 1.25;
    }
}
