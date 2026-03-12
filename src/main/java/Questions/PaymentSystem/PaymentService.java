package Questions.PaymentSystem;

public class PaymentService {
    public void pay(String provider, double amount) {
        PaymentProcessor paymentProcessor = PaymentFactory.getPaymentProcessor(provider);
        paymentProcessor.processPayment(amount);
    }
}
