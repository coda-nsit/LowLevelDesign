package Decorator;

public class Vanilla extends IceCream{
    public Vanilla(){
        description = "Vanilla";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}