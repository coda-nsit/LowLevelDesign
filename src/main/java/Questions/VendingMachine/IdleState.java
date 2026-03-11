package Questions.VendingMachine;

public class IdleState implements State{

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) {
        System.out.println("Inserting coin");
        machine.addBalance(coin.getValue());
        System.out.println("Inserted coin");
        machine.setState(machine.getHasMoneyState());
    }

    @Override
    public void selectProduct(VendingMachine machine, Product product) {
        System.out.println("Insert coin first");
    }
    @Override
    public void dispense(VendingMachine machine){
        System.out.println("Insert coin first");
    }
}
