package Abstract;

public abstract class Animal{
    private final String name;
    private String color;

    public Animal(String name, String color){
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract String changeFur();
}
