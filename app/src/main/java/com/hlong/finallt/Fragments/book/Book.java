package com.hlong.finallt.Fragments.book;

public class Book {
    private int resourceId;
    private String tittle;

    public Book(int resourceId, String tittle) {
        this.resourceId = resourceId;
        this.tittle = tittle;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
}
