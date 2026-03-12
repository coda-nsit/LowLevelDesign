package Questions.MacBookInstallation;

public class MacBookPro implements MacBook{
    @Override
    public String getDescription() {
        return "It is Mac Book Pro";
    }

    @Override
    public double cost() {
        return 999.0;
    }

}
