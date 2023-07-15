package me.ifmo.enums;

public enum Time{
    MORNING("утром, "),
    AFTERNOON("в обед "),
    EVENING("и вечером.");
    private final String name;
    Time(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public static String showList(){
        StringBuilder times = new StringBuilder("Available times:\n");
        for(Time time : values()){
            times.append(time.getName());
        }
        return times.substring(0);
    }
}
