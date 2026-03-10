package Bridge;

public class UPIPayment extends Payment{
    public UPIPayment(IPaymentGateway gateway) {
        super(gateway);
    }

    @Override
    void makePayment(double amount) {
        System.out.println("Paying with UPI ");
        gateway.processPayment(amount);
    }
}
