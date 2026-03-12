package Questions.MacBookInstallation;

public class Client {
    public static void main(String[] args) {
        // normal macbook
        MacBook macBook = new MacBookPro();
        macBook = new RAMUpgrade(macBook);
        macBook = new SSDUpgrade(macBook);
        macBook = new AppleCareUpgrade(macBook);
        System.out.println(macBook.getDescription());
        System.out.println("Total Price: $" + macBook.cost());

        // Macbook Neo
        MacBook macBook2 = new MacBookNeo();
        macBook2 = new SSDUpgrade(macBook2);
        macBook2 = new AppleCareUpgrade(macBook2);
        System.out.println(macBook2.getDescription());
        System.out.println("Total Price: $" + macBook2.cost());


    }
}
