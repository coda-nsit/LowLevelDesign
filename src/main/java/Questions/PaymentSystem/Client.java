package Questions.PaymentSystem;

public class Client {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        service.pay("Stripe", 100.0);
        service.pay("Paypal", 300.0);
    }
}
