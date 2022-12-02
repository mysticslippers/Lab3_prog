import Animated.*;
import Enums.Paws;
import Inanimated.*;
import Actions.Lookable;

public class Story{
    public static void main(String[] args){
        King king = new King("Король", 0, false);
        WhiteRabbit whiteRabbit = new WhiteRabbit("Кролик", "Коричневый");
        Alice alice = new Alice("Алиса", 5, true);
        Table table = new Table("стол");
        Dish dish = new Dish("блюдо");
        Pie pie = new Pie("пирожок");

        /*
        #1
        Lookable lookable;
        lookable = () -> ", и вид у них был такой аппетитный, что у ";
         */

        /*
        #2
        Lookable lookable;
        lookable = pie::look;
         */

        System.out.println(king.exist() + king.getName().replace("ь", "я") + whiteRabbit.exist() + whiteRabbit.changeFur() + " " + whiteRabbit.getName() + ", " + Paws.Right.hold() + Paws.Right.getName() + Paws.Left.hold() + Paws.Left.getName() + ".");
        System.out.println(table.stay() + table.getName() + "," + dish.stay() + dish.getName() + " с " + pie.getName().replace("ок", "ками") + pie.look() + alice.getName().replace("а", "ы") + alice.Hunger());
        System.out.println(alice.Dream());
    }
}
