
package Queue;

public class QueueInUse {

    
    public static void main(String[] args) {
    TheQueue theQueue = new TheQueue(10);
    theQueue.insert(10);
    theQueue.insert(15);
    theQueue.insert(11);
    theQueue.peek();
    theQueue.displayTheQueue();
    
    theQueue.remove();
    theQueue.peek();
    theQueue.displayTheQueue();
    
    theQueue.remove();
    theQueue.peek();
    theQueue.displayTheQueue();
    
    theQueue.remove();
    theQueue.peek();
    theQueue.displayTheQueue();
    
    theQueue.WhoBuildThis();
      
    }
    
}
