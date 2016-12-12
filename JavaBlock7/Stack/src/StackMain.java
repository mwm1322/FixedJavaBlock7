import java.util.Iterator;

/**
 * Created by block7 on 12/7/16.
 */
public class StackMain {

    public static void testQueue(){
        Queue queue = new Queue();
        queue.add(new LSStackItem("1"));
        queue.add(new LSStackItem("2"));
        queue.add(new LSStackItem("3"));
        queue.add(new LSStackItem("4"));
        queue.remove();
        queue.printQueue();
        System.out.println(queue.peek());
    }

    public static void main(String[] args){
        testQueue();
    }

    public static void testStack(){
        LSStack stack = new LSStack();

        stack.push(new LSStackItem("a"));
        stack.push(new LSStackItem("b"));
        stack.push(new LSStackItem("c"));
        stack.printStack();
        //stack.pop();
        //stack.printStack();
        //stack.pop();
        //stack.printStack();

//        Iterator<LSStackItem> myIterator = stack.iterator();
//        while(myIterator.hasNext()){
//            LSStackItem item = myIterator.next();
//            System.out.print(item);
//        }
        for (LSStackItem item : stack){
            System.out.print(item);
        }
    }

}
