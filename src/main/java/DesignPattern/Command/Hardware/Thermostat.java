package Command.Hardware;

public class Thermostat {
    private int temperature;
    public void increaseTemperature() {
        this.temperature += 1;
        System.out.println("Thermostat's increase temperature was called");
    }

    public void decreaseTemperature() {
        this.temperature -= 1;
        System.out.println("Thermostat's decrease temperature was called");
    }
}
