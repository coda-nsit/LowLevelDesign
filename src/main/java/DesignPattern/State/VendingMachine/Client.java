package DesignPattern.State.VendingMachine;

public class Client {
    public static void main(String[] args) {

        // Create the singleton VendingMachine
        var vendingMachine = VendingMachine.getVendingMachine();
        vendingMachine.initialize();

        // Initially the VendingMachine is in IdleState where it just tells to select product
        vendingMachine.setVendingMachineState(IdleState.getIdleState());

        // Do actions on the vending machine. Client doesnt worry about state transitions.
        vendingMachine.selectProduct("DietCoke");
        vendingMachine.payCoin(1);
        vendingMachine.dispenseProduct();
    }
}
