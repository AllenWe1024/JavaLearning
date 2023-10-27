class window1Test implements Runnable {
    private int ticket = 100;
    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ' ' + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

class windowTs {
    public static void main(String[] args) {
        window1Test w1 = new window1Test();
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3 = new Thread(w1);
        t1.start();
        t2.start();
        t3.start();
    }
}