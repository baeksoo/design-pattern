package com.example.demo.creation.builder;

public class builderClient {

    public static void main(String[] args) {
        final ImageProperty imageProperty = ImageProperty.Builder(100, 100, "/kb/repository")
                                                         .frame(0)
                                                         .quality(85)
                                                         .ratio(1)
                                                         .format("jpeg")
                                                         .build();
        System.out.println(imageProperty);
    }
}
