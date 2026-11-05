
package library.service;

import java.util.ArrayList;
import java.util.List;

import library.model.Lendable;

public class Library {

    private List<Lendable> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(Lendable item) {
        if (item != null) {
            items.add(item);
        }
    }

    public void removeItem(Lendable item) {
        items.remove(item);
    }

    public List<Lendable> getAvailableItems() {

        List<Lendable> available = new ArrayList<>();

        for (Lendable item : items) {
            if (!item.isBorrowed()) {
                available.add(item);
            }
        }

        return available;
    }

    public void listAllItems() {
        for (Lendable item : items) {
            System.out.println(item.getDescription());
        }
    }
}
