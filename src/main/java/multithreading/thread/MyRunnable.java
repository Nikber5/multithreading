package multithreading.thread;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyRunnable implements Runnable {
    private static final Logger logger = LogManager.getLogger(MyRunnable.class);

    private final Counter counter;

    public MyRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getValue() < 100) {
            counter.increaseValue();
            logger.info(Thread.currentThread().getName() + " value = " + counter.getValue());
        }
    }
}
