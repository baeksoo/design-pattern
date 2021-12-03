package com.example.demo.behavior.state;

public class LightOnState implements State {

    @Override
    public void on(final Light light) {
        System.out.println("전구 이미 켜져 있음");
    }

    @Override
    public void off(final Light light) {
        System.out.println("전구 꺼짐");
        light.changeLightType(new LightOffState());
    }
}
