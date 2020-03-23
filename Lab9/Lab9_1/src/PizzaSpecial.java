
public class PizzaSpecial extends Pizza {
    private String special;
    public PizzaSpecial(String name,double price,String special){
        super(name,price);
        this.special = special;
    }
    public String getSpecial(){
        return special;
    }
    @Override
    public String toString(){
        return this.getName()+" price : "+this.getPrice()+" special : "+special;
    }
}
