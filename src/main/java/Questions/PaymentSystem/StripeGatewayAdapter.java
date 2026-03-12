package Questions.PaymentSystem;

public class StripeGatewayAdapter implements PaymentProcessor {

    private StripeGateway stripeGateway;
    public StripeGatewayAdapter(StripeGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }
    @Override
    public void processPayment(double amount) {
        stripeGateway.makePayment(amount);
    }

}
