package Questions.ParkingLot;

public class Car implements Ivehicle {
    String vehicleSize;
    String licensePlate;

    public Car(String vehicleSize, String licensePlate) {
        this.vehicleSize = vehicleSize;
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return this.licensePlate;
    }

    public String getVehicleSize() {
        return this.vehicleSize;
    }

    public String toString() {
        return "Car{vehicleSize='" + this.vehicleSize + "', licensePlate='" + this.licensePlate + "'}";
    }
}