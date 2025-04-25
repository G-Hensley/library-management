package org.example;

import java.util.ArrayList;

public class Library {

    private ArrayList<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem item) {
        items.add(item);
        System.out.println("Added item: " + item.getTitle());
    }

    public void borrowItem(String id) {
        for (LibraryItem item: items) {
            if (item.getId().equals(id)) {
                item.borrowItem();
                return;
            }
        }
        throw new IllegalArgumentException("Item with ID: " + id + " not found");
    }

    public void returnItem(String id) {
        for (LibraryItem item: items) {
            if (item.getId().equals(id)) {
                item.returnItem();
                return;
            }
        }
        throw new IllegalArgumentException("Item with ID: " + id + " not found");
    }

    public void listAllItems() {
        System.out.println("Library items: ");

        if (items.isEmpty()) {
            System.out.println("\tNo items found");
        } else {
            for (LibraryItem item: items) {
                String status = item.isAvailable() ? "Available" : "Borrowed";
                System.out.println("\t" + item.getTitle() + " (ID: " + item.getId() + "): " + status);
            }
        }
    }
}
