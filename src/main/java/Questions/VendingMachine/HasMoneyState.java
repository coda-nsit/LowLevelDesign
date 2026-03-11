package Questions.VendingMachine;

public class HasMoneyState implements State{

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) {
        machine.addBalance(coin.getValue());
    }

    @Override
    public void selectProduct(VendingMachine machine, Product product) {
        if(machine.getBalance() < product.getPrice()) {
            System.out.println("Not enough money");
            return;
        }

        machine.setSelectedProduct(product);
        machine.setState(machine.getDispensingState());
    }
    @Override
    public void dispense(VendingMachine machine){
        System.out.println("Select product first");
    }
}
