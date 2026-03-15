package Questions.VendingMachine;

//State (interface)
// ├── insertCoin()
// ├── selectProduct()
// ├── dispense()


//State
// ├── IdleState
// ├── HasMoneyState
// ├── DispensingState
// └── OutOfStockState

public interface State {
    void insertCoin(VendingMachine machine, Coin coin);
    void selectProduct(VendingMachine machine, Product product);
    void dispense(VendingMachine machine);
}
