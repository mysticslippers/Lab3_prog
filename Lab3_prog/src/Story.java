import Animated.*;
import Enums.Paws;
import Inanimated.*;

public class Story{
    public static void main(String[] args){
        King king = new King("Король", 0, false);
        WhiteRabbit whiteRabbit = new WhiteRabbit("Кролик", "Коричневый");
        Alice alice = new Alice("Алиса", 5, true);
        Table table = new Table("стол");
        Dish dish = new Dish("блюдо");
        Pie pie = new Pie("пирожок");
        System.out.println(king.Exist() + king.getName().replace("ь", "я") + whiteRabbit.Exist() + whiteRabbit.changeFur() + " " + whiteRabbit.getName() + ", " + Paws.Right.Hold() + Paws.Right.getName() + Paws.Left.Hold() + Paws.Left.getName() + ".");
        System.out.println(table.Stay() + table.getName() + "," + dish.Stay() + dish.getName() + " с " + pie.getName().replace("ок", "ками") + pie.Look() + alice.getName().replace("а", "ы") + alice.Hunger());
        System.out.println(alice.Dream());
    }
}
