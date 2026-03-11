package Questions.ParkingLot;

public class Ticket {
    private ParkingSpot parkingSpot;
    private Ivehicle Vehicle;
    private int ticketId;
    private double amount;
    private String ticketStatus;

    public static Ticket createTicket(Ivehicle vehicle, ParkingSpot spot) {
        System.out.println("Creating Ticket for the Vehicle with parking spot");
        Ticket ticket = new Ticket();
        ticket.Vehicle = vehicle;
        ticket.parkingSpot = spot;
        return ticket;
    }

    public String toString() {
        String var10000 = String.valueOf(this.parkingSpot);
        return "Ticket{parkingSpot=" + var10000 + ", Vehicle=" + String.valueOf(this.Vehicle) + ", ticketId=" + this.ticketId + ", amount=" + this.amount + ", ticketStatus='" + this.ticketStatus + "'}";
    }
}
