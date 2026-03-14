package CommandBaishali;

public class LightOffCoomand implements Command {
    Light light;
    public LightOffCoomand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.turnOff();
    }
}