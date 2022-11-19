public class Story{
    public static void main(String[] args){
        King king = new King("Король", 0, false);
        WhiteRabbit whiteRabbit = new WhiteRabbit("Белый Кролик", "белый");
        Alice alice = new Alice("Алиса", 5, true);
        Table table = new Table("стол");
        Dish dish = new Dish("блюдо");
        System.out.println("По правую руку от " + king.getName().replace('ь', 'я') + whiteRabbit.Exist() + whiteRabbit.getName() + ", " + Paws.Right.Hold() + Paws.Right.getName() + Paws.Left.Hold() + Paws.Left.getName() + ".");
        System.out.println(table.Stay() + table.getName() + "," + dish.Stay() + "\n" + alice.getName().replace('а', 'ы') + alice.Hunger());
        System.out.println(alice.Dream());
    }
}
