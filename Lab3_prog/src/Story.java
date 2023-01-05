import Animated.*;
import Inanimated.*;
import Enums.Paws;
import Actions.Lookable;

public class Story{
    public static void main(String[] args){
        King king = new King("Король", false, 100);
        WhiteRabbit whiteRabbit = new WhiteRabbit("Кролик", "Коричневый");
        Alice alice = new Alice("Алиса", true, 100);
        Table table = new Table("стол");
        Dish dish = new Dish("блюдо");
        Pies pies = new Pies("пирожки");

        king.waiting();
        alice.waiting();

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
        System.out.println(table.stay() + table.getName() + "," + dish.stay() + dish.getName() + " с " + pies.getName().replace("ки", "ками") + pies.look() + alice.getName().replace("а", "ы") + alice.getCondition());
        System.out.println(alice.Dream());
    }
}
