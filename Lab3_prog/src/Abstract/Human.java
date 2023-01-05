package Abstract;

public abstract class Human{
    private final String name;
    private final boolean gender;
    private int appetite;

    public Human(String name, boolean gender, int appetite){
        this.name = name;
        this.gender = gender;
        this.appetite = appetite;
    }
    public String getName() {
        return name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public int getAppetite() {
        return appetite;
    }

    public abstract void waiting();
}
