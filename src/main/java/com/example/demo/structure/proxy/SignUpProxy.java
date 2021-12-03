package com.example.demo.structure.proxy;

import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;

public class SignUpProxy implements SignUp {
    private final SignUp signUp;

    public SignUpProxy() {
        this.signUp = new SignUpImpl();
    }

    @Override
    public void signUp(final String id, final String passwards) {
        final String hashedPasswards = DigestUtils.md5DigestAsHex(passwards.getBytes(StandardCharsets.UTF_8));
        signUp.signUp(id, hashedPasswards);
    }
}
