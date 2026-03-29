package DesignPattern.Decorator.IceCream;

public class Main {

    public static void main(String[] args) {
        IceCreamBaseFlavor vanillaBaseFlavor = new VanillaBaseFlavor();
        var vanillaBaseFlavorWithChocolateChips = new WithChocolateChips(vanillaBaseFlavor);

        // create a vanilla ice cream with nuts add on
        var vanillaBaseFlavorWithChocolateChipsWithNuts = new WithNuts(vanillaBaseFlavorWithChocolateChips);

        // create a butterscotch ice cream with caramel add on
        // IceCream iceCream2 = new ButterScotch();
        // iceCream2 = new WithCaramel(iceCream2);

    }

    public static void printIceCream(IceCreamBaseFlavor iceCream) {
        System.out.println("Cost : " + iceCream.cost() + " Description : " + iceCream.getDescription());
    }

}
