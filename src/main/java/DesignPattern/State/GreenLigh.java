package State;

public class GreenLigh implements Light{
    @Override
    public void change(TrafficLight trafficLight){
        System.out.println("Green Light - Go");
        trafficLight.setState(new YellowLight());
    }
}
