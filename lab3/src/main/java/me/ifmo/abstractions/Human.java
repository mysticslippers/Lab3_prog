package me.ifmo.abstractions;

public abstract class Human {
    private String name;
    private boolean gender;

    public Human(String name, boolean gender) {
        this.name = name;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public boolean isGender() {
        return this.gender;
    }

    public abstract void call();
}
