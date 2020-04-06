package interfacetester;

import java.util.ArrayList;

class SelfCheckOut implements SimpleQueue {
    private ArrayList productQueue = new ArrayList();
    private static double totalAmount ;
    @Override
    public void enqueue(Object o) {
        Product product = (Product) o ;
        productQueue.add(o);
        System.out.println(product.getName()+" is added in queue");
        
    }

    @Override
    public void dequeue() {
        Product product = (Product) productQueue.get(0) ;
        totalAmount += product.getPrice();
        productQueue.remove(0);
        
    }
    public double getAmount(){
        return totalAmount;
    }
    
}
