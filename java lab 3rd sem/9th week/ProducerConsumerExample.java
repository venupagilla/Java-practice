class Producer extends Thread {
    private final Object lock;
    private int data;

    public Producer(Object lock) {
        this.lock = lock;
    }

    public void run() {
        try {
            while (true) {
                synchronized (lock) {
                    data++;
                    System.out.println("Produced: " + data);
                    lock.notify();  // Notify the consumer
                    lock.wait();    // Wait for the consumer to consume
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread {
    private final Object lock;
    private int data;

    public Consumer(Object lock) {
        this.lock = lock;
    }

    public void run() {
        try {
            while (true) {
                synchronized (lock) {
                    lock.wait();   // Wait for the producer to produce
                    System.out.println("Consumed: " + data);
                    lock.notify(); // Notify the producer
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        Object lock = new Object();
        Producer producer = new Producer(lock);
        Consumer consumer = new Consumer(lock);

        producer.start();
        consumer.start();

        // Start the producer by notifying it first
        synchronized (lock) {
            lock.notify();
        }
    }
}
