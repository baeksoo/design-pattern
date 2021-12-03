package com.example.demo.behavior.state;

public class LightOffState implements State {

    @Override
    public void on(final Light light) {
        System.out.println("전구 켜짐");
        light.changeLightType(new LightOnState());
    }

    @Override
    public void off(final Light light) {
        System.out.println("이미 전구 꺼져있음");
    }
}
