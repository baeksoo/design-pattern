package com.example.demo.behavior.responsibility;

public class RequestFirstServiceHandler implements RequestHandler {

    private final RequestHandler nextRequestHandler;

    public RequestFirstServiceHandler(final RequestHandler requestHandler) {
        this.nextRequestHandler = requestHandler;
    }

    @Override
    public void handle(final Request request) {
        if (request.isFirstRemoteServiceRequest())
            System.out.println("첫번째 서비스를 호출합니다.");
        else
            nextRequestHandler.handle(request);
    }
}
