
public class InsectPopulation {
    private double insect;
    public InsectPopulation(double startPopulation){
        insect = startPopulation;
    }
    public void breed(){
        insect = insect*2;
    }
    public void spray(){
        insect = insect*0.9;
    }
    public double getNumInsect(){
        return insect;
    }
    
}
