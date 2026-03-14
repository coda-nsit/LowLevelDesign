package Questions.ElevatorSystem;

import java.util.List;

public class NearestElevatorSelectionStrategy implements ElevationSlectionStrategy {

    public Elevator ElevationSlectionStrategy(List<Elevator> elevators, Request request){
        Elevator bestElevator = null;
        int minDistance = Integer.MAX_VALUE;

        for (Elevator elevator : elevators){
            int distance = Math.abs(elevator.getCurrentFloor() - request.getSourceFloor());
            if (distance < minDistance){
                bestElevator = elevator;
                minDistance = distance;
            }
        }
        return bestElevator;
    }
}
