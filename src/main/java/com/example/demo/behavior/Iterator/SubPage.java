package com.example.demo.behavior.Iterator;

public class SubPage {

    private final long pageNo;
    private final String subject;

    public SubPage(final long pageNo, final String subject) {
        this.pageNo = pageNo;
        this.subject = subject;
    }

    public long getPageNo() {
        return pageNo;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "pageNo : " + pageNo + ", subject : " + subject;
    }
}
