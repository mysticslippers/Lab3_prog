package Animated;

import Abstract.Human;
import Actions.Existable;
public class King extends Human implements Existable{
    public King(String name, int appetite, boolean gender){
        super(name, appetite, gender);
    }

    @Override
    public String exist(){
        return "По правую руку от ";
    }
}
