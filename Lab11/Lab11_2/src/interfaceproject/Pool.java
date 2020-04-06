
package interfaceproject;
public class Pool extends Terrain{
    public Pool(String name) {
        super(name);
    }
    @Override
    public boolean canMove(Animal animal) {
        if(animal instanceof CanSwim) { 
            return true;
        } 
        
        return false;
    }
}
