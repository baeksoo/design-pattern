package com.example.demo.behavior.responsibility;

public class ResponsibilityClient {
    public static void main(final String[] args) {
        final RequestHandler requestHandler = new RequestFirstServiceHandler(new RequestSecondServiceHandler(null));

        final Request request = new Request(true);
        requestHandler.handle(request);
        final Request request1 = new Request(false);
        requestHandler.handle(request1);
    }
}
