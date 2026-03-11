package Questions.VendingMachine;

public class DispensingState implements State{

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) {
        System.out.println("Please wait dispensing");
    }

    @Override
    public void selectProduct(VendingMachine machine, Product product) {
        System.out.println("Already selected");
    }

    public void dispense(VendingMachine machine) {

        Product product = machine.getSelectedProduct();

        machine.getInventory().dispense(product);

        System.out.println("Dispensed: " + product.getName());

        machine.resetBalance();

        machine.setState(machine.getIdleState());
    }

}
