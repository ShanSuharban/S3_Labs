class Table {
    void printTable(int n) {
        // Synchronizing only the critical section
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}

class MyRunnable implements Runnable {
    Table t;
    int number;

    MyRunnable(Table t, int number) {
        this.t = t;
        this.number = number;
    }

    public void run() {
        t.printTable(number);
    }
}

public class SyncRunnable {
    public static void main(String args[]) {
        Table obj = new Table(); // Only one object
        Thread t1 = new Thread(new MyRunnable(obj, 5));
        Thread t2 = new Thread(new MyRunnable(obj, 100));
        t1.start();
        t2.start();
    }
}
