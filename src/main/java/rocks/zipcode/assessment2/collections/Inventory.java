package rocks.zipcode.assessment2.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    Map<String,Integer> store;
    List<String> strings;

    public Inventory(List<String> strings) {
    this.strings = strings;
        this.store = new HashMap<>();
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        this.store = new HashMap<>();
        this.strings = new ArrayList<>();
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        store.put(item, getItemQuantity(item) + 1);
        return;
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {

        store.put(item, getItemQuantity(item)-1);
        return;
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {

        if (store.containsKey(item)) {
            return store.get(item);
        }
        return 0;
    }
}
