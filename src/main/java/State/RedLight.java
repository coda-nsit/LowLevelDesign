package State;

public class RedLight implements Light{
    @Override
    public void change(TrafficLight trafficLight){
        System.out.println("RED Light - STOP");
        trafficLight.setState(new GreenLigh());
    }
}
