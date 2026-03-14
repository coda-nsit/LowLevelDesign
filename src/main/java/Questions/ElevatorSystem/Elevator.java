package Questions.ElevatorSystem;

import java.util.PriorityQueue;

public class Elevator {

    private int id;
    private int currentFloor;
    private Direction direction;
    private ElevatorState state;

    private PriorityQueue<Integer> upStops;
    private PriorityQueue<Integer> downStops;
    public Elevator(int id) {
        this.id = id;
        this.currentFloor = 0;
        this.direction = Direction.UP;
        this.state = new IdleState();;
        this.upStops = new PriorityQueue<>();
        this.downStops = new PriorityQueue<>((a,b) -> b - a);
    }
    public void move() {
        state.move(this);   // delegate movement
    }

    public void addStop(int floor) {

        if(floor > currentFloor)
            upStops.add(floor);
        else
            downStops.add(floor);
    }

    public void setState(ElevatorState state) {
        this.state = state;
    }

    public int getNextUpStop(){
        return upStops.peek();
    }

    public void requestFloor(int floor) {
        state.handleRequest(this, floor);   // delegate to state
    }

    public void addStops(int floor){
        if(floor<this.currentFloor){
            downStops.add(floor);
        }else{
            upStops.add(floor);
        }
    }


    public int getCurrentFloor() {
        return currentFloor;
    }

    public ElevatorState getState() {
        return state;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

}
