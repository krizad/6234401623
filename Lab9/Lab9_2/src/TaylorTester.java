
public class TaylorTester {
    public static void main(String[] args) {
        expo exp = new expo(7, 1);
        exp.printValue();
        sine s = new sine(7, Math.PI/4);
        s.printValue();
        cosine cs = new cosine(7, 1);
        cs.printValue();
    }
    
}
