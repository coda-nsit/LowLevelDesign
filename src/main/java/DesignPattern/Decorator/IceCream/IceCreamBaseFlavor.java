package DesignPattern.Decorator.IceCream;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class IceCreamBaseFlavor {
    private String description;

    public IceCreamBaseFlavor() {
        description = "Unknown ice cream base flavor.";
    }

    abstract double cost();
}