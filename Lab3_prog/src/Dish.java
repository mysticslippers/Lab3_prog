public class Dish implements Stayable{
    private final String name;
    private final static int countOfPies = 5;

    public Dish(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public static int getCountOfPies(){
        return countOfPies;
    }

    @Override
    public String Stay(){
        return " а на нем красовалось большое блюдо с пирожками, и вид у них был такой аппетитный, что у ";
    }
}
