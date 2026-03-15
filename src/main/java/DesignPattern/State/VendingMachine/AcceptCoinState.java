package DesignPattern.State.VendingMachine;

public class AcceptCoinState implements IState {
    private static AcceptCoinState insertCoinState;

    private AcceptCoinState() { }

    public static AcceptCoinState getAcceptCoinState() {
        if (insertCoinState == null) {
            insertCoinState = new AcceptCoinState();
        }
        return insertCoinState;
    }

    @Override
    public void selectProduct(String productName) {
        System.out.println("Product has already been selected.");
    }

    @Override
    public void acceptCoins(int amount) {
        var vendingMachine = VendingMachine.getVendingMachine();
        vendingMachine.amount = amount;
        System.out.printf("Payment of %d has been accepted.\n", amount);
        vendingMachine.setVendingMachineState(vendingMachine.productDispenseState);
    }

    @Override
    public IProduct dispenseProduct() {
        System.out.println("Product can't be dispensed as amount not paid yet.");
        return null;
    }
}
