package Questions.VendingMachine;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    Map<Product, Integer> inventory = new HashMap<Product, Integer>();

    public boolean isProductAvailable(Product product) {
        return inventory.getOrDefault(product, 0) > 0;
    }

    public void addProduct(Product product, int quantity) {
        inventory.put(product, quantity);
    }

    public Product dispense(Product product) {
        if (isProductAvailable(product)) {
           inventory.put(product, inventory.get(product) - 1);
        }
        return product;
    }
}
