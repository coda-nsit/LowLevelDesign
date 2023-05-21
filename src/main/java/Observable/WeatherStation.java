package Observable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class WeatherStation implements IWeatherStation {

    Set<IDevice> devices;
    private int temperature;
    private int humidity;

    WeatherStation() {
        devices = new HashSet<>();
    }

    void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyToDevice();
    }

    void setHumidity(int humidity) {
        this.humidity = humidity;
        notifyToDevice();
    }

    @Override
    public void addDevice(IDevice device) {
        devices.add(device);
    }

    @Override
    public void removeDevice(IDevice device) {
        devices.remove(device);
    }

    @Override
    public void notifyToDevice() {
        for (IDevice device: devices) {
            device.update();
        }
    }

    @Override
    public int getTemperature() {
        return temperature;
    }

    @Override
    public int getHumidity() {
        return humidity;
    }
}
