package interfacetester;
public class InterfaceTester {
    public static void main(String[] args) {
        MusicBox m = new MusicBox();
        m.enqueue("ออเจ้าเอย");
        m.enqueue("เธอหนอเธอ");
        m.enqueue("เพียงสบตา");
        m.enqueue("บุพเพสันนิวาส");
        m.dequeue();
        m.dequeue();
        m.dequeue();
        m.dequeue();
        SelfCheckOut s = new SelfCheckOut();
        s.enqueue(new Product("Pen", 25));
        s.enqueue(new Product("Pencil", 10));
        s.enqueue(new Product("Ruler", 20));
        s.enqueue(new Product("Eraser", 15));
        s.enqueue(new Product("Pencil Box", 30));
        s.dequeue();
        s.dequeue();
        s.dequeue();
        s.dequeue();
        s.dequeue();
        System.out.println("Total amount = " + s.getAmount());
    }
    
}
