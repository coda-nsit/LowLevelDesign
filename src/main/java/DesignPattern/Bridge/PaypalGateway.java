package Bridge;

public class PaypalGateway implements IPaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paypal gateway processing amount: " + amount);
    }
}
