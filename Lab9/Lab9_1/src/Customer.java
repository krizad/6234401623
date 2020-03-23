
public class Customer {
    private String name,tel;
    public Customer(String name,String tel){
        this.name = name;
        this.tel = tel;
    }
    public String getName(){
        return name;
    }
    public String getTel(){
        return tel;
    }
    @Override
    public String toString(){
        return name+" Tel : "+tel;
    }
    
}
