package com.example.demo.behavior.responsibility;

public class Request {
    public Boolean isFirstRemoteServiceRequest() {
        return isFirstRemoteServiceRequest;
    }

    private Boolean isFirstRemoteServiceRequest;

    public Request(final Boolean isFirstRemoteServiceRequest) {this.isFirstRemoteServiceRequest = isFirstRemoteServiceRequest;}


}
