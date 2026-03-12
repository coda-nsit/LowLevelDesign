package Questions.MacBookInstallation;

public class RAMUpgrade extends MacBookUpgrades {

    MacBook macBook;

    public RAMUpgrade(MacBook macBook) {
        this.macBook = macBook;
    }

    @Override
    public double cost() {
        return macBook.cost() + 300.0;
    }

    @Override
    public String getDescription() {
        return macBook.getDescription() + ", 16 GB Ram ";
    }
}
