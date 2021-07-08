package multithreading;

import multithreading.thread.Counter;
import multithreading.thread.MyRunnable;
import multithreading.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread myThread = new MyThread(counter);
        Runnable myRunnable = new MyRunnable(counter);
        Thread runnableThread = new Thread(myRunnable);
        myThread.start();
        runnableThread.start();
    }
}
