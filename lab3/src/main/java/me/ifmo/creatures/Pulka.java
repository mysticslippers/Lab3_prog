package me.ifmo.creatures;

import me.ifmo.abstractions.Human;
import me.ifmo.interfaces.ExistAble;
import me.ifmo.interfaces.RageAble;

public class Pulka extends Human implements ExistAble, RageAble{
    public Pulka(String name, boolean gender){
        super(name, gender);
    }

    public static Pulka getInstance(){
        return new Pulka("Пулька", true);
    }

    @Override
    public void call(){
        Pulka pulka = getInstance();
        Nurse firstNurse = new Nurse("Она ", false);
        firstNurse.setNumber(1);
        Nurse secondNurse = new Nurse("Другую нянечку", false);
        secondNurse.setNumber(2);
        Nurse thirdNurse = new Nurse("Третью нянечку", false);
        thirdNurse.setNumber(3);
        System.out.println(firstNurse.getName() + firstNurse.exist() + pulka.getName().replace("а", "и") + ", так как это, по ее мнению, успокаивало больного.");
        System.out.print(secondNurse.getName() + " " + pulka.getName() + " посылал " + secondNurse.exist());
        secondNurse.setNumber(4);
        System.out.println(secondNurse.exist());
        System.out.print(thirdNurse.getName() + " " + thirdNurse.exist());
    }

    @Override
    public String exist(){
        return "К тому же Пулька сам себе повредил.";
    }

    @Override
    public String rage(){
        return "";
    }
}
