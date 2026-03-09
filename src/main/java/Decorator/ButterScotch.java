package Decorator;

public class ButterScotch extends IceCream{
    public ButterScotch(){description = "Butterscotch" ;}

    @Override
    public double cost() {
        return 1.25;
    }
}
