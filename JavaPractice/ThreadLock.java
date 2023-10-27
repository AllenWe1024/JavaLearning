import java.util.concurrent.locks.ReentrantLock;

class Window implements Runnable {
    int ticket = 100;
    // 1. 创建Lock的实例，必须确保多个线程共享同一个Lock实例
    private final ReentrantLock lock = new ReentrantLock();

    public void run() {

        while (true) {
            try {
                // 2. 调动lock()，实现需共享的代码的锁定
                lock.lock();
                if (ticket > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(ticket--);
                } else {
                    break;
                }
            } finally {
                // 3. 调用unlock()，释放共享代码的锁定
                lock.unlock();
            }
        }
    }
}

public class ThreadLock {
    public static void main(String[] args) {
        Window t = new Window();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);

        t1.start();
        t2.start();
    }
}