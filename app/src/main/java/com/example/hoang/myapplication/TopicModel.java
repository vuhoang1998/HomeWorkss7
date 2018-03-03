package com.example.hoang.myapplication;

/**
 * Created by hoang on 3/1/2018.
 */

class TopicModel {
    public int id;
    public String name;
    public String imageUrl;
    public String category;
    public String color;
    public String LastTime;

    public TopicModel(int id, String name, String imageUrl, String category, String color, String lastTime) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.category = category;
        this.color = color;
        LastTime = lastTime;
    }

    @Override
    public String toString() {
        return "TopicModel{" +
                "name='" + name + '\'' +
                '}';
    }
}
