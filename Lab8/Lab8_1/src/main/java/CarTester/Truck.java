package CarTester;
public class Truck extends Car{
    private double maxWeight;
    private double weight;
    public Truck(double gas,double efficiency,double maxWeight,double weight){
        super(gas,efficiency);
        if (weight>maxWeight){
                        this.maxWeight = maxWeight;
                        this.weight = maxWeight;}
        else{this.maxWeight = maxWeight;
             this.weight = weight;}  
    }
    @Override
    public void drive(double distance){
        double gasUsed = distance/super.getEfficiency();
        if (weight<1){gasUsed = gasUsed*1;}
        else if (weight>=1 && weight<=10){gasUsed = gasUsed*1.1;}
        else if (weight>=11 && weight<=20){gasUsed = gasUsed*1.2;}
        else if (weight>20){gasUsed = gasUsed*1.3;}
        if (gasUsed > super.getGas()){System.out.println("You cannot drive too far,"+"please add gas");}
        else{super.addGas(-gasUsed);}
    }
}
