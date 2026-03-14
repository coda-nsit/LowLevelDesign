package Questions.ElevatorSystem;

import java.util.ArrayList;
import java.util.List;

public class ElevatorSystem {
    //Factory ElevatorSystem
    List<Elevator> elevators;
    ElevationSlectionStrategy elevationSlectionStrategy;

    private ElevatorSystem(int numberOfElevators) {
        elevators = new ArrayList<>();
        elevationSlectionStrategy = new NearestElevatorSelectionStrategy();
        for(int i=0;i<numberOfElevators;i++) {
            elevators.add(new Elevator(i));
        }
    }
    private static ElevatorSystem instance;
    public static ElevatorSystem getInstance(int numberOfElevators) {
        if (instance == null) {
            instance = new ElevatorSystem(numberOfElevators);
        }
        return instance;
    }

    public void requestElevator(Request request) {
        elevationSlectionStrategy.ElevationSlectionStrategy(elevators, request);
    }
}
