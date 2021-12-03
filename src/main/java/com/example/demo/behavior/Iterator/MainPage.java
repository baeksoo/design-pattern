package com.example.demo.behavior.Iterator;

import java.util.ArrayList;
import java.util.List;

public class MainPage {
    private final List<SubPage> subPages = new ArrayList<>();

    public PageIterator getSubPageIteratorOrderByPageNo() {
        return new PageIterator(subPages);
    }

    public void addSubPage(final SubPage subPage) {
        subPages.add(subPage);
    }
}
