
package CityGridTester.CityGridTester;

import java.util.Random;

public class CityGrid {
    private int xCoor;
    private int yCoor;
    private final int gridSize;
public CityGrid(int size){gridSize = size;xCoor = size/2;yCoor = size/2;}
public void walk(){
    Random gen = new Random();
        int w = gen.nextInt(4);
        switch (w){
            case 0:
                xCoor++;
                break;
            case 1:
                xCoor--;
                break;
            case 2:
                    yCoor++;
                break;
            case 3:
                yCoor--;
                break;
}
}
public boolean isInCity(){
    boolean test;
    if (xCoor>=0 && yCoor>=0 && yCoor <= gridSize && xCoor <= gridSize){test = true;}
    else{test = false;}
    return test;  
}
public void reset(){xCoor = gridSize/2;yCoor = gridSize/2;}  
}
