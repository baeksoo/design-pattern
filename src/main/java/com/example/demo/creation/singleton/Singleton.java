package com.example.demo.creation.singleton;

public class Singleton {

    private Singleton() { }

    private static class SettingHolder {
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SettingHolder.instance;
    }
}
