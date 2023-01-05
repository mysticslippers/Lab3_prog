package Inanimated;

import Actions.Lookable;
public class Pies implements Lookable{
    private final String name;

    public Pies(String name){
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