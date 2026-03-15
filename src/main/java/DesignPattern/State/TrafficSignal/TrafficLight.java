package State;

public class TrafficLight {

    private Light currentState;

    public TrafficLight() {
        currentState = new RedLight();
    }

    public void setState(Light state) {
        this.currentState = state;
    }

    public void changeLight() {
        currentState.change(this);
    }

}
