/**
 * Created by block7 on 1/3/17.
 */
public class ThreadSandbox {

    public static class TestThread implements Runnable {
        Thread myThread;
        String name;

        public TestThread(String name){
            this.name = name;
            myThread = new Thread(this, name);
            System.out.println("Created thread " + name);
        }
        public void go(){
            System.out.println("Executing thread " + name);
            myThread.start();
        }

        public void run(){
            try {
                for (int i =0; i < 10; i++) {
                    System.out.println("Thread " + name + " " + i);
                    Thread.sleep(50);
                }
            } catch (InterruptedException e){
                System.out.println("Thread" + name + " interrupted");
            }
            System.out.println("Thread " + name + " ernding");
        }
    }

    public static void main(String[] args){
        TestThread t1, t2;
        t1 = new TestThread("Thread 1");
        t2 = new TestThread("Thread 2");
        t1.go();
        t2.go();
    }
}
