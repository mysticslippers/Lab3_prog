package Animated;

import Abstract.Animal;
import Actions.Existable;
public class WhiteRabbit extends Animal implements Existable{
    public WhiteRabbit(String name, String color){
        super(name, color);
    }

    @Override
    public String changeFur(){
        while(this.getColor().equals("Коричневый")){
            int randomNumber = (int)(Math.random() * 12) + 1;
            if(randomNumber == 1 || randomNumber == 2 || randomNumber == 12){
                this.setColor("Белый");
            }
            else{
                this.setColor("Коричневый");
            }
        }
        return this.getColor();
    }

    @Override
    public String exist(){
        return " находился ";
    }
}