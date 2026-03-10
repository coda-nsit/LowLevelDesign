package Observable;

public interface IWeatherStation {
    public void addDevice(IDevice device);
    public void removeDevice(IDevice device);

    public void notifyToDevice();
    public int getTemperature();
    public int getHumidity();
}
