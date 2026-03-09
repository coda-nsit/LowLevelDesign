package Decorator;

public class Main {
    public static void main(String[] args) {
        IceCream vanilla = new Vanilla();
        printIcream(vanilla);
    }

    public static void printIcream(IceCream iceCream) {
        System.out.println("Vanilla: cost : " + iceCream.cost() + " Description" + iceCream.description);
    }

}
