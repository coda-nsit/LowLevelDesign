package Questions.MacBookInstallation;

public class SSDUpgrade extends MacBookUpgrades{

    public SSDUpgrade(MacBook macBook) {
        this.macBook = macBook;
    }

    @Override
    public String getDescription() {
        return macBook.getDescription() + ", 1 TB SSD";
    }
    @Override
    public double cost() {
        return macBook.cost() + 500.0;
    }
}
