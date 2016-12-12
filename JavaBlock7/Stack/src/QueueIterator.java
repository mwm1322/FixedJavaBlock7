import java.util.Iterator;

/**
 * Created by block7 on 12/9/16.
 */
public class QueueIterator implements Iterator<LSStackItem> {
    Queue myQueue;
    int currentPosition;

    public QueueIterator(Queue queue){
        myQueue = queue;
        currentPosition = 0;
    }

    public boolean hasNext(){
        return currentPosition < myQueue.myList.size();
    }

    public LSStackItem next(){
        return myQueue.myList.get(currentPosition++);
    }

    public void remove(){
        throw new UnsupportedOperationException();
    }
}
