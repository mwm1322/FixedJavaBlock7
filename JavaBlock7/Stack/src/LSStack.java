import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by block7 on 12/7/16.
 */
public class LSStack implements Iterable<LSStackItem> {
    ArrayList<LSStackItem> myList = new ArrayList<LSStackItem>();
    LSStack() {}

    public  Iterator<LSStackItem> iterator(){
        return new LSStackIterator(this);
    }

    void push(LSStackItem obj){
        myList.add(0, obj);
    }

    Object pop(){
        if (isEmpty())
            return null;
        return myList.remove(0);
    }

    boolean isEmpty(){
        return myList.size() == 0;
    }

    Object peek(){
        if (isEmpty())
            return null;
        return myList.get(0);
    }

    void printStack(){
        System.out.println("---------");
        for (LSStackItem obj : myList){
            System.out.print(obj);
        }
        System.out.println("");
    }
}
