package Decorator;

public class Main {

    public static void main(String[] args) {
        IceCream vanilla = new Vanilla();
        //printIceCream(vanilla);
        vanilla = new WithChocolateChips(vanilla);
       // printIceCream(vanilla);

        // create a vanilla icecream with nuts add on
        vanilla = new WithNuts(vanilla);
        //printIceCream(vanilla);

        // create a butterscotch icecream with caramel add on
        //IceCream butterscotch = new ButterScotch();
       // butterscotch = new WithCramel(butterscotch);
       // printIceCream(butterscotch);

    }

    public static void printIceCream(IceCream iceCream) {
        System.out.println("Cost : " + iceCream.cost() + " Description : " + iceCream.getDescription());
    }

}
