package Questions.ParkingLot;

public class ParkingSpot {
    private Integer floorNumber;
    private Integer spotNumber;

    public ParkingSpot(Integer floorNumber, Integer spotNumber) {
        this.floorNumber = floorNumber;
        this.spotNumber = spotNumber;
    }

    public Integer getfloorNumber() {
        return this.floorNumber;
    }

    public void setfloorNumber(Integer floorNumber) {
        this.floorNumber = floorNumber;
    }

    public Integer getSpotNumber() {
        return this.spotNumber;
    }

    public void setSpotNumber(Integer spotNumber) {
        this.spotNumber = spotNumber;
    }

    public String toString() {
        return "ParkingSpot{floorNumber=" + this.floorNumber + ", spotNumber=" + this.spotNumber + "}";
    }
}
