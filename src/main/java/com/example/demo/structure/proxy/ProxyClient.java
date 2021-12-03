package com.example.demo.structure.proxy;

public class ProxyClient {
    public static void main(String[] args) {
        final SignUp signUp = new SignUpProxy();
        signUp.signUp("이규범", "1101215");
    }
}
