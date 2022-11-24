package Animated;

import Actions.Existable;
public class WhiteRabbit implements Existable {
    private final String name;
    private final String color;

    public WhiteRabbit(String name, String color){
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String Exist(){
        return " находился ";
    }
}
