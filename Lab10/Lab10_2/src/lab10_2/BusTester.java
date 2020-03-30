package lab10_2;

import java.util.ArrayList;

public class BusTester {
    public static void main(String[] args) {
        ArrayList<Bus> arr = new ArrayList();
        Hybrid hybridBus = new Hybrid(45,1.2,600,150,1);
        CNGBus cngBus = new CNGBus(50,1,200,2);
        arr.add(hybridBus);
        arr.add(cngBus);
               for (Bus b:arr){
                System.out.println("ID: "+b.getID());
                if (b instanceof Hybrid){
                    Hybrid bus = (Hybrid)b;
                    System.out.println("Emission Tier: "+bus.getEmissionTier());
                    System.out.println("Accel: "+bus.getAccel());
                    }
                if (b instanceof CNGBus){
                    CNGBus bus = (CNGBus)b;
                    System.out.println("Emission Tier: "+bus.getEmissionTier());
                    System.out.println("Accel: "+bus.getAccel());
                    }
            }
    }
    
}
