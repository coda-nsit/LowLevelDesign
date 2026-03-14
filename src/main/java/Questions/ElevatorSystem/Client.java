package Questions.ElevatorSystem;

public class Client {

    public static void main(String[] args) {

        Elevator elevator = new Elevator(1);

        elevator.requestFloor(5);
        elevator.move();

        elevator.requestFloor(2);
        elevator.move();
    }
}
