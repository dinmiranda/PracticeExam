class Mosey implements Runnable {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print(Thread.currentThread().getId() + "-" + i + " ");
        }
    }
}

public class Stroll {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(new Mosey());
        // insert code here
        t1.setPriority(10);
        new Mosey().run();
        t1.start();
    }
}