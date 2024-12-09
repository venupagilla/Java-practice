public class ThreadExample {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    System.out.println("Good Morning");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    System.out.println("Hello");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    System.out.println("Welcome");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
