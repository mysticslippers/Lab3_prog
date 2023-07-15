package me.ifmo.enums;

public enum Actions{
    OBSERVE,
    CARRY_OUT,
    REPORT,
    TELL;

    public static String showList(){
        StringBuilder actions = new StringBuilder("Available actions:\n");
        for(Actions action : values()){
            actions.append(action.name()).append(",\n");
        }
        return actions.substring(0, actions.length() - 2);
    }
}
