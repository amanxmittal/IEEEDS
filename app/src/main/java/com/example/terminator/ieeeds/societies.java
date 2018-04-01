package com.example.terminator.ieeeds;

/**
 * Created by TERMINATOR on 3/31/2018.
 */

public class societies {

    private int id;
    private String title, description;
    private int image;

    public societies(int id, String title, String description, int image) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }
}
