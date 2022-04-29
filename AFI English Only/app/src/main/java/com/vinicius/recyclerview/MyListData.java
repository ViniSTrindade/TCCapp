package com.vinicius.recyclerview;

public class MyListData {
    private String name;
    private int id;
    private boolean isPlaying;

    public MyListData(String name, int id, boolean isPlaying) {
        this.name = name;
        this.id = id;
        this.isPlaying = isPlaying;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }
}