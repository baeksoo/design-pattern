package com.example.demo.behavior.Iterator;

public class IteratorClient {

    public static void main(final String[] args) {
        final MainPage mainPage = new MainPage();
        mainPage.addSubPage(new SubPage(2,"2번"));
        mainPage.addSubPage(new SubPage(1,"1번"));

        final PageIterator subPageIteratorOrderByPageNo = mainPage.getSubPageIteratorOrderByPageNo();
        while(subPageIteratorOrderByPageNo.hasNext()) {
            System.out.println(subPageIteratorOrderByPageNo.next());
        }
    }
}
