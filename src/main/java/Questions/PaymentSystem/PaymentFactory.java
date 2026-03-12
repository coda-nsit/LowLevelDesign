package Questions.PaymentSystem;

public class PaymentFactory {

    public static PaymentProcessor getPaymentProcessor(String type) {

        switch (type.toLowerCase()) {

            case "stripe":
                return new StripeGatewayAdapter(new StripeGateway());

            case "paypal":
                return new PayPalAdapter(new PaypalGateway());

            default:
                throw new IllegalArgumentException("Unsupported payment type");
        }
    }
}
