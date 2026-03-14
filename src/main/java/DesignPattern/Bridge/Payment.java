package Bridge;

abstract class Payment {

    protected IPaymentGateway gateway;

    public Payment(IPaymentGateway gateway) {
        this.gateway = gateway;
    }

    abstract void makePayment(double amount);
}
