package Questions.ParkingLot;

public class VehicleCreator {
    public static Ivehicle createVehicle(String VehicleType) {
        if (VehicleType.equalsIgnoreCase("Car")) {
            return new Car("MEDIUM", "12345WA");
        } else {
            return VehicleType.equalsIgnoreCase("Truck") ? new Truck("LARGE", "12349WA") : null;
        }
    }
}