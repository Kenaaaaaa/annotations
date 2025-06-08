package org.example.Inventory;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Product product = new Product("Banana", 1.2, 5);
        Product product2 = new Product("Apple", 1.5, 7);
        Product product3 = new Product("Orange", 1.8, 2);

        Inventory inventory = new Inventory("Piramida",0,new ArrayList<>());

        inventory.addProduct(product);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        System.out.println(inventory);

        inventory.updatePrice("Banana", 1.1);

        System.out.println("New Inventory: " + inventory);

        System.out.println("Lower quantity: " + inventory.lowerQuantity());


    }
}
