
package interfaceproject;
public class Sky extends Terrain{
    public Sky(String name) {
        super(name);
    }
    @Override
    public boolean canMove(Animal animal) {
        if(animal instanceof CanFly) { 
            return true;
        } 
        
        return false;
    }
}
