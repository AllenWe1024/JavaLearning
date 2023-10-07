class Communication implements Runnable {
    volatile int i = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                notify();
                if (i <= 100) {
                    System.out.println(Thread.currentThread().getName() + ":" + i++);
                } else
                    break;
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class CommunicationTest {
    public static void main(String[] args) {
        Communication cm = new Communication();
//        Communication cm2 = new Communication();
        Thread t1 = new Thread(cm, "cm1");
        Thread t2 = new Thread(cm, "cm2");
        t1.start();
        t2.start();

    }
}