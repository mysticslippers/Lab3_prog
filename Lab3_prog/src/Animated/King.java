package Animated;

import Abstract.Human;
import Actions.Existable;
public class King extends Human implements Existable{
    public King(String name, boolean gender, int appetite){
        super(name, gender, appetite);
    }

    @Override
    public String exist(){
        return "По правую руку от ";
    }

    @Override
    public void waiting(){
        this.setAppetite(0);
    }
}