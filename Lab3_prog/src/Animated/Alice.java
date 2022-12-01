package Animated;

import Abstract.Human;
import Inanimated.Dish;
import java.util.Objects;
public class Alice extends Human {

    private String condition;
    public Alice(String name, int appetite, boolean gender){
        super(name, appetite, gender);
    }

    public String getCondition(){
        return condition;
    }


    @Override
    public String toString(){
        return "Alice_" + getName();
    }

    @Override
    public boolean equals(Object condition){
        if (this.getCondition() == condition){
            return true;
        }
        if (condition == null || getClass() != condition.getClass()){
            return false;
        }
        this.condition = (String) condition;
        return Objects.equals(condition, this.condition);
    }

    @Override
    public int hashCode(){
        return (this.condition == null) ? 0 : this.condition.hashCode();
    }

    public String Hunger(){
        while(this.getAppetite() + Dish.getCountOfPies() == 50){
            this.appetite += 1;
            this.condition = "недостаточно голодна";
        }
        this.condition = " прямо слюнки потекли.";
        return this.condition;
    }

    public String Dream(){
        if(this.equals(" прямо слюнки потекли.") && this.condition.hashCode() == this.hashCode()){
            return "\"Хорошо бы, суд уже кончился и позвали к столу!\" - подумала она.";
        }
        return null;
    }
}
