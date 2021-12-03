package com.example.demo.creation.prototype;

import java.util.ArrayList;
import java.util.List;

public class Proto implements Cloneable {
    private List<String> a = new ArrayList<>();
    private List<String> b = new ArrayList<>();

    public void addA(String a) {
        this.a.add(a);
    }

    public void addB(String b) {
        this.b.add(b);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "a : " + a + " b : " + b;
    }
}
