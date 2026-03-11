package Questions.VendingMachine;

public class VendingMachine {

    private State idleState = new IdleState();
    private State hasMoneyState = new HasMoneyState();
    private State dispensingState = new DispensingState();

    private State currentState = idleState;

    private Inventory inventory = new Inventory();

    private int balance;
    private Product selectedProduct;

    // Making the vending machine instance singleton as I am assuming that Vending machine is one and is physically present
    private static  VendingMachine instance;
    private VendingMachine() {
        currentState = new IdleState();
    }

    public static synchronized VendingMachine getInstance() {
        if (instance == null) {
            instance = new VendingMachine();
        }
        return instance;
    }

    public void setState(State state) {
        currentState = state;
    }

    public void insertCoin(Coin coin) {
        currentState.insertCoin(this, coin);
    }

    public void selectProduct(Product product) {
        currentState.selectProduct(this, product);
    }

    public void dispense() {
        currentState.dispense(this);
    }

    public void addBalance(int value) {
        balance += value;
    }

    public int getBalance() {
        return balance;
    }

    public void resetBalance() {
        balance = 0;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public State getIdleState() {
        return idleState;
    }

    public State getHasMoneyState() {
        return hasMoneyState;
    }

    public State getDispensingState() {
        return dispensingState;
    }

    public void setSelectedProduct(Product product) {
        this.selectedProduct = product;
    }

    public Product getSelectedProduct() {
        return selectedProduct;
    }
}