

public class BlockedStateDemo {
private static final Object lock = new Object();

public static void main(String[] args) {
    Thread thread1 = new Thread(new Task(), "Thread-A");
    Thread thread2 = new Thread(new Task(), "Thread-B");

    thread1.start();
    thread2.start();
}

static class Task implements Runnable {
    public void run() {
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + " acquired lock");
            try {
                Thread.sleep(10000); // hold the lock for 10 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " released lock");
        }
    }
}
}

