package com.example.demo.structure.adaptor;

public class Adaptor implements AdaptorInterface{

    @Override
    public void operationA() {
        new Adaptee().operationA();
    }
}
