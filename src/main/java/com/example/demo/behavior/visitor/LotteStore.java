package com.example.demo.behavior.visitor;

public class LotteStore implements Store {
    @Override
    public void getProductAndPrintName(final Food food) {
        System.out.println(food.getName() + "가 롯데마트에 입고되었습니다.");
    }

    @Override
    public void getProductAndPrintName(final Clothes clothes) {
        System.out.println(clothes.getName() + "가 롯데마트에 입고되었습니다.");
    }
}
