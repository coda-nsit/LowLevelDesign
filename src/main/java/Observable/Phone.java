package Observable;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Phone implements IDevice, IDisplay {

    private String name;
    private WeatherStation weatherStation;
    @Override
    public void update() {
        display(weatherStation.getTemperature());
        display(weatherStation.getHumidity());
    }

    @Override
    public void display(int dataToDisplay) {
        System.out.println("This is phone named " + name + "'s display: " + dataToDisplay);
    }
}
