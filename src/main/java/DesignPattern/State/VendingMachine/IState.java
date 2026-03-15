package DesignPattern.State.VendingMachine;

public interface IState {
    void selectProduct(String productName);
    void acceptCoins(int amount);
    IProduct dispenseProduct();
}
