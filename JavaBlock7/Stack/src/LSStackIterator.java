import java.util.Iterator;

/**
 * Created by block7 on 12/9/16.
 */
public class LSStackIterator implements Iterator<LSStackItem> {
    LSStack myStack;
    int currentPosition;

    public LSStackIterator(LSStack stack){
        myStack = stack;
        currentPosition = 0;
    }

    public boolean hasNext(){
        return currentPosition < myStack.myList.size();
    }

    public LSStackItem next(){
        return myStack.myList.get(currentPosition++);
    }

    public void remove(){
        throw new UnsupportedOperationException();
    }
}
