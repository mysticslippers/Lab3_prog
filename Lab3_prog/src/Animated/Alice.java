package Animated;

import Inanimated.Dish;
public class Alice extends King{

    private String condition;
    public Alice(String name, boolean gender, int appetite) {
        super(name, gender, appetite);
    }

    public String getCondition(){
        return condition;
    }

    @Override
    public String toString(){
        return "Alice_" + getName();
    }

    @Override
    public int hashCode(){
        return (this.condition == null) ? 0 : this.condition.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof String) {
            String comparableString = (String) object;
            int length = condition.length();
            if (length == comparableString.length()) {
                int i = 0;
                while (length-- != 0) {
                    if (condition.charAt(i) != comparableString.charAt(i)) {
                        return false;
                    }
                    i++;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public void waiting(){
        this.setAppetite(0);
        while(this.getAppetite() + Dish.getCountOfPies() == 50){
            this.setAppetite(this.getAppetite() + 1);
            this.condition = "недостаточно голодна";
        }
        this.condition = " прямо слюнки потекли.";
    }

    public String Dream(){
        if(this.equals(" прямо слюнки потекли.") && this.condition.hashCode() == this.hashCode()){
            return "\"Хорошо бы, суд уже кончился и позвали к столу!\" - подумала она.";
        }
        return null;
    }
}
