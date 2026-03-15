package DesignPattern.State.VendingMachine;

public class VendingMachine {
    private static VendingMachine vendingMachine;

    private IState currentVendingMachineState;

    public IState idleState;
    public IState acceptCoinState;
    public IState productDispenseState;

    public int amount;

    private VendingMachine() { }

    public static synchronized VendingMachine getVendingMachine() {
        if (vendingMachine == null) {
            vendingMachine = new VendingMachine();
        }
        return vendingMachine;
    }

    public void setVendingMachineState(IState newVendingMachineState) {
        currentVendingMachineState = newVendingMachineState;
    }

    public void initialize() {
        idleState = IdleState.getIdleState();
        acceptCoinState = AcceptCoinState.getAcceptCoinState();
        productDispenseState = ProductDispenseState.getProductDispenseState();
    }

    public void selectProduct(String productName) {
        currentVendingMachineState.selectProduct(productName);
    }

    public void payCoin(int amount) {
        currentVendingMachineState.acceptCoins(amount);
    }

    public void dispenseProduct() {
        currentVendingMachineState.dispenseProduct();
    }
}
