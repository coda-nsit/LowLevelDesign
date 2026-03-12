package State;

public class YellowLight implements Light{
    @Override
    public void change(TrafficLight trafficLight){

        System.out.println("Yellow Light - SLOW DOWN");
        trafficLight.setState(new RedLight());
    }
}