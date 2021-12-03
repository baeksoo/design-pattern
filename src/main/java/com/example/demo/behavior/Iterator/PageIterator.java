package com.example.demo.behavior.Iterator;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class PageIterator implements Iterator<SubPage> {
    private final Iterator<SubPage> pages;

    public PageIterator(final List<SubPage> subPages) {
        this.pages = subPages.stream()
                             .sorted(Comparator.comparing(SubPage::getPageNo))
                             .iterator();
    }

    @Override
    public boolean hasNext() {
        return pages.hasNext();
    }

    @Override
    public SubPage next() {
        return pages.next();
    }
}
