package Bridge;

public class CreditCardPayment extends Payment{
    public CreditCardPayment(IPaymentGateway gateway) {
        super(gateway);
    }

    public void makePayment(double amount) {
        System.out.println("Paying with Credit Card");
        gateway.processPayment(amount);
    }
}
