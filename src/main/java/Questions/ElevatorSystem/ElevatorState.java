package Questions.ElevatorSystem;

public interface ElevatorState {
    void handleRequest(Elevator elevator, int floor);

    void move(Elevator elevator);
}
