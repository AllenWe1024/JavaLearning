public class Thread奇偶 {
    public static void main(String[] args) {
        MyThread1 mr1 = new MyThread1();
        MyThread2 mr2 = new MyThread2();
        Thread m1 = new Thread(mr1);
        Thread m2 = new Thread(mr2);
        m1.start();
        m2.start();
        System.out.println(m2.getPriority());

    }
}

class MyThread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.println("i=" + i);
        }

    }
}

class MyThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println("i=" + i);
        }

    }
}