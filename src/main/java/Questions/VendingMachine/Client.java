package Questions.VendingMachine;

public class Client {
    public static void main(String[] args) {
        VendingMachine machine = VendingMachine.getInstance();
        Product coke = new Product("COKE", 10);
        machine.getInventory().addProduct(coke, 5);
        machine.insertCoin(Coin.TEN);
        machine.selectProduct(coke);

        machine.dispense();

    }
}
