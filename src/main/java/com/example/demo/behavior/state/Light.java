package com.example.demo.behavior.state;

public class Light {
    private State lightState; // state

    public Light() {this.lightState = new LightOffState();} // Context(State)

    public void changeLightType(final State state) { // changeState(State)
        this.lightState = state;
    }

    public void on() { // operation
        lightState.on(this);
    }

    public void off() { // operation
        lightState.off(this);
    }
}
