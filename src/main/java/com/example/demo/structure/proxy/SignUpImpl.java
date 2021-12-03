package com.example.demo.structure.proxy;

public class SignUpImpl implements SignUp {
    @Override
    public void signUp(final String id, final String passwards) {
        System.out.println("id: " + id + " passwards: " + passwards);
    }
}
