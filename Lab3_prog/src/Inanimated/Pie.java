package Inanimated;

import Actions.Lookable;
public class Pie implements Lookable{
    private final String name;

    public Pie(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String look(){
        return ", и вид у них был такой аппетитный, что у ";
    }
}
