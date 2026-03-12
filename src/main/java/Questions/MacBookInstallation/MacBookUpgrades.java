package Questions.MacBookInstallation;


public abstract class MacBookUpgrades implements MacBook {

    protected MacBook macBook;


    @Override
    public String getDescription() {
        return macBook.getDescription();
    }

    @Override
    public double cost() {
        return macBook.cost();
    }
}
