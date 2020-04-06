package interfacetester;

import java.util.ArrayList;

public class MusicBox implements SimpleQueue {

    private ArrayList musicQueue = new ArrayList();

    @Override
    public void enqueue(Object o) {
        musicQueue.add(o);
        System.out.println(o + " is added in queue.");
    }

    @Override
    public void dequeue() {
        Object music = musicQueue.get(0);
        System.out.println("Now playing " + music);
        musicQueue.remove(0);
    }

}
