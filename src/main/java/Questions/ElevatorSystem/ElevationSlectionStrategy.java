package Questions.ElevatorSystem;

import java.util.List;

public interface ElevationSlectionStrategy {
    Elevator ElevationSlectionStrategy(List<Elevator> elevators, Request request);
}
