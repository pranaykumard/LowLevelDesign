package ecommerce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();

        // Create objects using valid constructors
        Clothing tShirt = new Clothing("C1", "T-Shirt", 100.99, 10, "50");
        Book java = new Book("B1", "Java Programming", 50.88, 20, "500");
        Book python = new Book("B2", "Python Programming", 45.99, 15, "1000");
        Electronics laptop = new Electronics("E1", "Laptop", 999.99, 5, 500);

        // Add objects to the list
        items.add(tShirt);
        items.add(java);
        items.add(python);
        items.add(laptop);

        // Test compareTo (compare two items based on the name field)
        System.out.println("Comparison (T-Shirt vs Java Programming): " + items.get(0).compareTo(items.get(1)));

        // Sort the items using compareTo
        Collections.sort(items);

        // Display sorted items
        System.out.println("Sorted Items:");
        for (Item item : items) {
            System.out.println(item);
        }

        // Testing Inventory class
        Inventory<Item> inventory = new Inventory<>();
        inventory.addItem(tShirt);
        inventory.addItem(java);
        inventory.addItem(python);
        inventory.addItem(laptop);

        // Retrieve an item by ID
        System.out.println("Get Item with ID C1: " + inventory.getItem("C1"));

        // Remove an item
        inventory.removeItem(tShirt);

        // Add the same item multiple times
        inventory.addItem(tShirt);
        inventory.addItem(tShirt);

        // Display all items in the inventory
        System.out.println("All Items in Inventory:");
        for (Item item : inventory.getAllItems()) {
            System.out.println(item);
        }
    }
}
