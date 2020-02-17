
package SodaTester;

import java.util.Scanner;

public class SodaTester {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter height:");
        float height = in.nextFloat();
        System.out.print("Enter diameter:");
        float diameter = in.nextFloat();
        SodaCan soda = new SodaCan(diameter,height);
        System.out.println("Volume:"+soda.getVolume());
        System.out.println("Surface area:"+soda.getSurfaceArea());
        
    }
    
}
