package Questions.ParkingLot;

public class Truck implements Ivehicle {
    String vehicleSize;
    String licensePlate;

    public Truck(String vehicleSize, String licensePlate) {
        this.vehicleSize = vehicleSize;
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return this.licensePlate;
    }

    public String getVehicleSize() {
        return this.vehicleSize;
    }
}