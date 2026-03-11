package Questions.ParkingLot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingManager {
    List<ParkingSpot> availableParkingSpots;
    Map<Ivehicle, ParkingSpot> spotToVehicleMapping;
    Map<ParkingLot, List<ParkingSpot>> availableParkingSpotsInTheLot;

    public List<ParkingSpot> getAvailableParkingSpotsInTheLot() {
        this.availableParkingSpots = new ArrayList();
        ParkingSpot parkingSpot1 = new ParkingSpot(1, 3);
        ParkingSpot parkingSpot2 = new ParkingSpot(1, 2);
        ParkingSpot parkingSpot3 = new ParkingSpot(1, 10);
        ParkingSpot parkingSpot4 = new ParkingSpot(1, 1);
        this.availableParkingSpots.add(parkingSpot1);
        this.availableParkingSpots.add(parkingSpot2);
        this.availableParkingSpots.add(parkingSpot3);
        this.availableParkingSpots.add(parkingSpot4);
        return this.availableParkingSpots;
    }

    public List<ParkingSpot> getParkingSpotsInTheLot(ParkingLot parkingLot, List<ParkingSpot> availableParkingSpots) {
        this.availableParkingSpotsInTheLot = new HashMap();
        this.availableParkingSpotsInTheLot.put(parkingLot, availableParkingSpots);
        return (List)this.availableParkingSpotsInTheLot.get(parkingLot);
    }

    public void updateParkingSpot(ParkingSpot parkingSpot) {
        System.out.println("Updating the parking spot" + String.valueOf(parkingSpot));
        this.availableParkingSpots.remove(0);
    }

    public ParkingSpot alotSpot() {
        System.out.println("**************Aloting the parking spot to vehicle ************");
        ParkingSpot spot = (ParkingSpot)this.availableParkingSpots.get(0);
        return spot;
    }

    public ParkingSpot setSpotToVehicleMapping(Ivehicle vehicle) {
        this.availableParkingSpots = new ArrayList();
        this.spotToVehicleMapping = new HashMap();
        if (this.getAvailableParkingSpotsInTheLot().isEmpty()) {
            System.out.println("No spots available");
            return null;
        } else {
            ParkingSpot parkingSpot = this.alotSpot();
            this.spotToVehicleMapping.put(vehicle, parkingSpot);
            this.updateParkingSpot(parkingSpot);
            return parkingSpot;
        }
    }

    public Ticket createTicketForVehicle(Ivehicle vehicle, ParkingSpot spot) {
        System.out.println("Creating ticket for vehicle: " + vehicle.getLicensePlate());
        return Ticket.createTicket(vehicle, spot);
    }

    public void createPayment(PaymentStrategy paymentStrategy, Ticket ticket) {
        paymentStrategy.pay(ticket);
    }
}