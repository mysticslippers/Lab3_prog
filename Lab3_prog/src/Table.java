public class Table implements Stayable{
    private final String name;

    public Table(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String Stay(){
        return "А в самом центре судебного зала стоял ";
    }


}
