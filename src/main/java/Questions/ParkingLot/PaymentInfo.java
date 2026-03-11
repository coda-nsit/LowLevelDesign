package Questions.ParkingLot;

import java.time.LocalDate;

public class PaymentInfo {
    private double amount;
    private LocalDate paymentDate;
    private int transactionId;
    private Ticket parkingTicket;
    private PaymentStatus paymentStatus;

    public PaymentInfo(double amount, LocalDate paymentDate, int transactionId, Ticket parkingTicket, PaymentStatus paymentStatus) {
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.transactionId = transactionId;
        this.parkingTicket = parkingTicket;
        this.paymentStatus = paymentStatus;
    }

    public String toString() {
        double var10000 = this.amount;
        return "PaymentInfo{amount=" + var10000 + ", paymentDate=" + String.valueOf(this.paymentDate) + ", transactionId=" + this.transactionId + ", ticket=" + String.valueOf(this.parkingTicket) + ", status=" + String.valueOf(this.paymentStatus) + "}";
    }
}
