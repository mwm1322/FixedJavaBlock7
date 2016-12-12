import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by block7 on 12/7/16.
 */
public class Queue implements Iterable<LSStackItem> {
    ArrayList<LSStackItem> myList = new ArrayList<LSStackItem>();

    Queue(){}

    public  Iterator<LSStackItem> iterator(){
        return new QueueIterator(this);
    }

    void add(LSStackItem obj){
        myList.add(0, obj);
    }

    LSStackItem remove(){
        if (isEmpty()) {
            return null;
        }
        return myList.remove(myList.size() - 1);
    }

    Object peek(){
        if (isEmpty())
            return null;
        return myList.get(myList.size() - 1);
    }

    boolean isEmpty(){
        return myList.size() == 0;
    }

    void printQueue(){
        System.out.println("---------");
        System.out.print("Back of Queue -->  ");
        for (Object obj : myList){
            System.out.print(obj + ", ");
        }
        System.out.print("<-- Front of Queue");
        System.out.println("");
    }
}
