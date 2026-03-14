package Questions.ElevatorSystem;

public class MovingUpState implements ElevatorState{
    @Override
    public void handleRequest(Elevator elevator, int floor) {
        elevator.addStops(floor);
    }

    @Override
    public void move(Elevator elevator) {
        Integer next = elevator.getNextUpStop();

        if(next == null) {
            elevator.setState(new IdleState());
            return;
        }

        System.out.println("Elevator moving UP to floor " + next);
        elevator.setCurrentFloor(next);
    }

}
