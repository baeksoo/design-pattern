package com.example.demo.structure.composit;

public class CompositClient {

    public static void main(String[] args) {
        final Item component = new Item("당근");
        final Item component1 = new Item("감자");

        final Inventory inventory = new Inventory();
        inventory.addComponent(component);
        inventory.addComponent(component1);

        final Inventory inventory1 = new Inventory();
        inventory1.addComponent(inventory);

        inventory.print();
        inventory1.print();
    }
}
