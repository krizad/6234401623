
import java.awt.Rectangle;
import java.util.Random;


public class IntersectionPrinter {
    public static void main(String[] args) {
        Random generator = new Random();
        int x = generator.nextInt(50)+1;
        int y = generator.nextInt(50)+1;
        int width = generator.nextInt(50)+1;
        int height = generator.nextInt(50)+1;
        Rectangle r1 = new Rectangle(x,y,width,height);
        System.out.println(r1);
        x = generator.nextInt(50)+1;
        y = generator.nextInt(50)+1;
        width = generator.nextInt(50)+1;
        height = generator.nextInt(50)+1;
        Rectangle r2 = new Rectangle(x,y,width,height);
        System.out.println(r2);
        Rectangle r3 = r1.intersection(r2);
        System.out.println("Is the intersected emtry?:"+r3.isEmpty());
    }   
    
    
}
