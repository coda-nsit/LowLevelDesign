package Questions.MacBookInstallation;

public class AppleCareUpgrade extends MacBookUpgrades{
    MacBook macBook;

    public AppleCareUpgrade(MacBook macBook) {
        this.macBook = macBook;
    }
    @Override
    public String getDescription() {
        return macBook.getDescription() + ", AppleCare";
    }
    @Override
    public double cost() {
        return macBook.cost() + 100.0;
    }
}
