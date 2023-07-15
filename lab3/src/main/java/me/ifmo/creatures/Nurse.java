package me.ifmo.creatures;

import me.ifmo.abstractions.Human;
import me.ifmo.enums.Actions;
import me.ifmo.enums.Time;
import me.ifmo.interfaces.ExistAble;

public class Nurse extends Human implements ExistAble{
    private Actions action;
    private String description;
    private int number;
    public Nurse(String name, boolean gender){
        super(name, gender);
    }

    public void setAction(Actions action){
        this.action = action;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public Actions getAction(){
        return action;
    }

    public String getDescription(){
        return description;
    }

    public int getNumber(){
        return number;
    }

    @Override
    public void call() {
        switch(getNumber()){
            case 1 -> setAction(Actions.CARRY_OUT);
            case 2 -> setAction(Actions.OBSERVE);
            case 3 -> setAction(Actions.TELL);
            default -> setAction(Actions.REPORT);
        }
    }

    @Override
    public String exist(){
        call();
        switch(getAction()){
            case OBSERVE -> setDescription(" посылал наблюдать, что делают остальные малыши, ");
            case CARRY_OUT -> setDescription(" знала, что ее крики делу не помогут, но выполняла требования ");
            case TELL -> setDescription(" он заставлял рассказывать ему с " + Time.MORNING.getName().replace("утром,", "утра") + "до " + Time.EVENING.getName().replace("и вечером.", "вечера ") + "сказки");
            case REPORT -> setDescription(" и докладывать ему по три раза в день: " + Time.showList());
        }
        return getDescription();
    }

    @Override
    public String toString(){
        return "Nurse: " + getName() + " " + getNumber() + " " + getAction();
    }

    @Override
    public int hashCode(){
        return (getDescription() == null) ? 0 : getDescription().hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof String comparableString) {
            int length = getName().length();
            if (length == comparableString.length()) {
                int i = 0;
                while (length-- != 0) {
                    if (getName().charAt(i) != comparableString.charAt(i)) {
                        return false;
                    }
                    i++;
                }
                return true;
            }
        }
        return false;
    }
}
