package Animated;

public abstract class Human{
    private final String name;
    public int appetite;
    private final boolean gender;

    public Human(String name, int appetite, boolean gender){
        this.name = name;
        this.appetite = appetite;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    public int getAppetite(){
        return appetite;
    }

    public boolean isGender() {
        return gender;
    }
}
