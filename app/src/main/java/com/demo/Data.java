package com.demo;

public class Data {
    public String id;
    public String title;

    public Data(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public Data() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
