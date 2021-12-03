package com.example.demo.behavior.state;

public interface State {
    void on(Light light);
    void off(Light light);
}
