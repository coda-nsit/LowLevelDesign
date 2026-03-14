package Bridge;

public class Client {
    public static void main(String[] args) {

        // paying with credit card using stripe gateway
        IPaymentGateway gateway1 = new StripeGateway();
        Payment payment1 = new CreditCardPayment(gateway1);
        payment1.makePayment(100);

        // paying with upi using paypal
        IPaymentGateway gateway2 = new PaypalGateway();
        Payment payment2 = new UPIPayment(gateway2);
        payment2.makePayment(200);
    }
}
