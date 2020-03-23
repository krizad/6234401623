
import java.util.ArrayList;


public class Order {
    public static int cntOrder = 0;
    private int id;
    private Customer c;
    private ArrayList<Pizza> p = new ArrayList<>();
    
    public Order(Customer c){
        this.c = c;
        cntOrder++;
    }
    public void addPizza(Pizza pizz){
        p.add(pizz);
    }
    public String getOrderDetail(){
        id = cntOrder;
        String pizzaDetail = "";
        for (Pizza pz:p)
            pizzaDetail+=pz.toString()+"\n";
        String totalPieces = "Total pieces : "+p.size();
        String totalCost = "Total cost : "+calculatePayment();
        return "Order id : "+id+"\n"+c.toString()+"\n"+pizzaDetail+totalPieces+"\n"+totalCost;
            
    }
    public double calculatePayment(){
        double totalPrice = 0,discount = 0;
        for (Pizza pz:p)
            totalPrice+=pz.getPrice();
        if (c instanceof GoldCustomer){
            GoldCustomer gc = (GoldCustomer) c;
            discount = totalPrice*gc.getDiscount()*0.01;
        }
        return totalPrice-discount;
    }
    
}

