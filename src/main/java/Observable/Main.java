package Observable;

public class Main {
    public static void main(String[] args) {
        // Create observable
        WeatherStation weatherStation = new WeatherStation();

        // Create observers
        IDevice iphone = new Phone("iphone", weatherStation);
        IDevice mac = new Laptop("mac", weatherStation);
        IDevice samsungGalaxy = new Phone("samsungGalaxy", weatherStation);
        IDevice dellInspiron = new Laptop("dellInspiron", weatherStation);

        // Subscribe the observers
        weatherStation.addDevice(iphone);
        weatherStation.addDevice(mac);
        weatherStation.addDevice(samsungGalaxy);
        weatherStation.addDevice(dellInspiron);

        // Change the values of temperature or humidity should notify the observers
        weatherStation.setHumidity(80);
        weatherStation.setTemperature(120);
    }
}
