package DesignPattern.State.VendingMachine;

public class IdleState implements IState {

    private static IdleState idleState;

    private IdleState() { }

    public static IdleState getIdleState() {
        if (idleState == null) {
            idleState = new IdleState();
        }
        return idleState;
    }

    @Override
    public void selectProduct(String productName) {
        // I actually don't know which is more expensive. This is just a toy example.
        if (productName.equals("DietCoke")) {
            System.out.println("Pay 1$");
        } else {
            System.out.println("Pay 2$");
        }
        VendingMachine vendingMachine = VendingMachine.getVendingMachine();
        vendingMachine.setVendingMachineState(vendingMachine.acceptCoinState);
    }

    @Override
    public void acceptCoins(int amount) {
        System.out.println("First select a product");
    }

    @Override
    public IProduct dispenseProduct() {
        System.out.println("First select a product and pay.");
        return null;
    }
}
