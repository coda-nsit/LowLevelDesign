package Questions.ParkingLot;

import java.util.List;

public class ParkingLot {
    private static ParkingLot parkingLot = null;
    private List<ParkingSpot> availableParkingSpots;

    private ParkingLot() {
        System.out.println("Parking Lot Constructor is private");
    }

    public static synchronized ParkingLot getInstance() {
        if (parkingLot == null) {
            parkingLot = new ParkingLot();
        }

        return parkingLot;
    }

    public void setAvailableParkingSpots(List<ParkingSpot> availableParkingSpots) {
        this.availableParkingSpots = availableParkingSpots;
    }
}