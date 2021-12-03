package com.example.demo.behavior.responsibility;

public class RequestSecondServiceHandler implements RequestHandler {

    private final RequestHandler nextRequestHandler;

    public RequestSecondServiceHandler(final RequestHandler requestHandler) {
        this.nextRequestHandler = requestHandler;
    }

    @Override
    public void handle(final Request request) {
        if (!request.isFirstRemoteServiceRequest()) {
            System.out.println("두번째 서비스를 호출합니다.");
            return;
        }
        if (nextRequestHandler == null)
            System.out.println("아무런 서비스가 호출되지 못했습니다.");
    }
}
