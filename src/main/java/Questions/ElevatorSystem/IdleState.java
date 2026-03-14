package Questions.ElevatorSystem;

public class IdleState implements ElevatorState{
    @Override
    public void handleRequest(Elevator elevator, int floor) {
        if(elevator.getCurrentFloor() > floor){
            elevator.setState(new MovingUpState());
        }else if(elevator.getCurrentFloor() < floor){
            elevator.setState(new MovingDownState());
        }
        elevator.addStop(floor);
    }
    @Override
    public void move(Elevator elevator) {
        System.out.println("Elevator is idle at floor " + elevator.getCurrentFloor());
    }
}
