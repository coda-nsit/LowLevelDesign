package Questions.ParkingLot;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        Ivehicle vehicle = VehicleCreator.createVehicle("CAR");
        ParkingLot parkingLot = ParkingLot.getInstance();
        ParkingManager parkingManager = new ParkingManager();
        List<ParkingSpot> availableParkingSpots = parkingManager.getAvailableParkingSpotsInTheLot();
        ParkingSpot spot = parkingManager.setSpotToVehicleMapping(vehicle);
        parkingLot.setAvailableParkingSpots(availableParkingSpots);
        Ticket ticket = parkingManager.createTicketForVehicle(vehicle, spot);
        PaymentStrategy paymentStrategy = new CashPaymentStrategy();
        parkingManager.createPayment(paymentStrategy, ticket);
    }
}