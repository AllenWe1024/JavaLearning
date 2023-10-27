public class DeadLockTest {
    public static void main(String[] args) {

        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        new Thread() {
            public void run() {
                synchronized (s1) {
                    s1.append("a");
                    // s2.append("1");
                    System.out.println("1:" + s1);
                    System.out.println("2:" + s2);

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (s2) {
                        // s1.append("b");
                        s2.append("2");

                        System.out.println("3:" + s1);
                        System.out.println("4:" + s2);

                    }
                }
            }
        }.start();

        new Thread() {
            public void run() {
                synchronized (s2) {
                    // s1.append("c");
                    s2.append("3");
                    System.out.println("5:" + s1);
                    System.out.println("6:" + s2);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (s1) {
                        s1.append("d");
                        // s2.append("4");

                        System.out.println("7:" + s1);
                        System.out.println("8:" + s2);

                    }

                }
            }
        }.start();

    }
}