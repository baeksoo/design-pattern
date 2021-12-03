package com.example.demo.creation.prototype;

public class ProtoTypeClient {
    public static void main(final String[] args) throws CloneNotSupportedException {
        final Proto object = new Proto();
        object.addA("a");
        final Proto object2 = (Proto) object.clone();
        object2.addA("b");
        System.out.println(object);
        System.out.println(object2);
    }
}
