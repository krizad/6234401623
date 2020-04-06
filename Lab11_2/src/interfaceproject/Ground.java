
package interfaceproject;
public class Ground extends Terrain{
    public Ground(String name) {
        super(name);
    }
    @Override
    public boolean canMove(Animal animal) {
        if(animal instanceof CanWalk) { 
            return true;
        } 
        
        return false;
    }
}
