package CommandBaishali;

public class FanOnCommand implements Command {
    Fan fan;
    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }
    @Override
    public void execute() {
        fan.turnOn();
    }
}