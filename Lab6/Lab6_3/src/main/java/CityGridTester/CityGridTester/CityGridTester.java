
package CityGridTester.CityGridTester;

public class CityGridTester {
public static void main(String args[]){
    CityGrid city = new CityGrid(10);
    int sumWalk = 0;
        int max = 0;
        for(int t=0;t<10000;t++){
            for(int i=0;i<1000;i++){
                city.walk();
                if (!city.isInCity()){
                    sumWalk+=i;
                    max = (i>max ? i : max);
                    city.reset();
                    break;
                }
            }
        }
        System.out.printf("Average number of steps that a person can take and is still in the city: %.2f\n",sumWalk/10000.0);
        System.out.println("Maximum number of steps that a person can take and is still in the city: "+max);
    }
}
    

