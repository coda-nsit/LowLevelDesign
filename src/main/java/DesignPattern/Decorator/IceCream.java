package Decorator;

public abstract class IceCream {
    String description = "Unknown IceCream";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}