
public class InsectPopulationTester {
    public static void main(String[] args){
    InsectPopulation insect = new InsectPopulation(10);
    insect.breed();
    insect.spray();
    System.out.println("Number of insects: "+insect.getNumInsect());
    insect.breed();
    insect.spray();
    System.out.println("Number of insects: "+insect.getNumInsect());
    insect.breed();
    insect.spray();
    System.out.println("Number of insects: "+insect.getNumInsect());
    }
}
