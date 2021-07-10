package com.sparta.week01.prac;

public class Tutor {
    private String name;
    private String bio;

    public Tutor() {

    }

    public Tutor(String name, String bio) {
        this.name = name;
        this.bio = bio;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
