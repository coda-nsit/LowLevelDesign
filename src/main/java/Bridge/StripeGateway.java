package Bridge;

public class StripeGateway implements IPaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Stripe gateway processing amount: " + amount);
    }
}
