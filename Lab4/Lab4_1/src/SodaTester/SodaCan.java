
package SodaTester;

public class SodaCan {
    private final float radious;
    private final float height;
    public SodaCan(float d,float h){
        radious = (float) (d/2.0);
        height = h;
    }
    public float getVolume(){
        return (float) Math.PI*radious*radious*height;
    }
    public float getSurfaceArea(){
        return (float) ((2*Math.PI*radious*height)+(2*Math.PI*radious*radious));
    }
}
