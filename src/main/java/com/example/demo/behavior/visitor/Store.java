package com.example.demo.behavior.visitor;

public interface Store { // Visitor
    void getProductAndPrintName(Food food);
    void getProductAndPrintName(Clothes clothes);
}
