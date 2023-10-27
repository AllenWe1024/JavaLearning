import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class 交替执行Test {

    public static void main(String[] args) {
        PrintRun printRun = new PrintRun();
        Thread thread1 = new Thread(printRun::run);
        Thread thread2 = new Thread(printRun::run);
        thread1.setName("线程1");
        thread2.setName("线程2");
        thread1.start();
        thread2.start();
    }

    public static class PrintRun {
        private final AtomicInteger count = new AtomicInteger(1); // 也可替换成volatile
        private final Lock lock = new ReentrantLock();
        private final Condition single = lock.newCondition();
        private final Condition twin = lock.newCondition();

        public void run() {
            lock.lock();
            try {
                while (count.get() <= 100) {
                    if (count.get() % 2 == 1) {
                        System.out.println(Thread.currentThread().getName() + "打印：" + count.get());
                        twin.signal(); // 不会真正唤醒twin，需要等待single释放锁
                        if (count.incrementAndGet() <= 100) {
                            single.await(); // single等待并释放锁
                        }
                    } else {
                        System.out.println(Thread.currentThread().getName() + "打印：" + count.get());
                        single.signal();
                        if (count.incrementAndGet() <= 100) {
                            twin.await();
                        }
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}
