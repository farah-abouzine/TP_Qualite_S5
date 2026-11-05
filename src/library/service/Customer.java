
package library.service;

import java.util.ArrayList;
import java.util.List;

import library.model.Lendable;

public class Customer {

    private String name;
    private List<Lendable> checkedOutItems;

    public Customer(String name) {
        this.name = name;
        checkedOutItems = new ArrayList<>();
    }

    public void checkOutItem(Lendable item) {
        if (item != null && !checkedOutItems.contains(item)
                && !item.isBorrowed()) {
            item.borrow();
            checkedOutItems.add(item);
        }
    }

    public void returnItem(Lendable item) {
        if (checkedOutItems.contains(item)) {
            item.returnItem();
            checkedOutItems.remove(item);
        }
    }
}
