
package MagicSquare;

public class MagicSquareTester {

    public static void main(String[] args) {
       int size = 5;
       MagicSquare table = new MagicSquare(size);
       System.out.println("Size : "+"\t"+size+"*"+size);
       System.out.println(table.toString());
    }
    
}
