package State;

public class Client {
    public static void main(String[] args) {
        TrafficLight trafficlight = new TrafficLight();
        trafficlight.changeLight();
        trafficlight.changeLight();
        trafficlight.changeLight();
    }
}
