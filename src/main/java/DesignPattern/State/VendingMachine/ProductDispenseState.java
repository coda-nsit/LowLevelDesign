package DesignPattern.State.VendingMachine;

public class ProductDispenseState implements IState {
    private static ProductDispenseState productDispenseState;

    private ProductDispenseState() { }

    public static ProductDispenseState getProductDispenseState() {
        if (productDispenseState == null) {
            productDispenseState = new ProductDispenseState();
        }
        return productDispenseState;
    }

    @Override
    public void selectProduct(String productName) {
        System.out.println("Product has already been selected.");
    }

    @Override
    public void acceptCoins(int amount) {
        System.out.println("Amount has been accepted.");
    }

    @Override
    public IProduct dispenseProduct() {
        VendingMachine vendingMachine = VendingMachine.getVendingMachine();
        IProduct product;
        if (vendingMachine.amount == 1) {
            product = new DietCoke();
        } else {
            product = new DietPepsi();
        }

        vendingMachine.amount = 0;
        vendingMachine.setVendingMachineState(IdleState.getIdleState());
        return product;
    }
}
