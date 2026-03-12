package Questions.MacBookInstallation;

public class MacBookNeo implements MacBook{
    @Override
    public String getDescription() {
        return "MacBook Neo";
    }

    @Override
    public double cost() {
        return 555.0;
    }
}
