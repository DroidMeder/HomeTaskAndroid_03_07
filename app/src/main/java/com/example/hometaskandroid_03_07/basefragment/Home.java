package com.example.hometaskandroid_03_07.basefragment;

public class Home {

    private final int path;
    private final int description;
    private final int date;

    public Home(int path, int description, int date) {
        this.path = path;
        this.description = description;
        this.date = date;
    }
    public int getPath() {
        return path;
    }

    public int getDescription() {
        return description;
    }

    public int getDate() {
        return date;
    }

}
