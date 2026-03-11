package Questions.ParkingLot;

import java.time.LocalDate;

public class CashPaymentStrategy implements PaymentStrategy {
    public PaymentInfo pay(Ticket parkingTicket) {
        System.out.println("Using cash as  payment strategy");
        PaymentInfo paymentInfo = new PaymentInfo((double)100.0F, LocalDate.now(), 123, parkingTicket, PaymentStatus.COMPLETED);
        System.out.println(paymentInfo);
        return paymentInfo;
    }
}