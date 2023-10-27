public class ConsumerProducerTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer p1 = new Producer(clerk);

        Consumer c1 = new Consumer(clerk);
        Consumer c2 = new Consumer(clerk);

        p1.setName("生产者1");
        c1.setName("消费者1");
        c2.setName("消费者2");

        p1.start();
        c1.start();
        c2.start();
    }
}

// 生产者
class Producer extends Thread {
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {

        System.out.println("=========生产者开始生产产品========");
        while (true) {

            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 要求clerk去增加产品
            clerk.addProduct();
        }
    }
}

// 消费者
class Consumer extends Thread {
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("=========消费者开始消费产品========");
        while (true) {

            try {
                Thread.sleep(90);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 要求clerk去减少产品
            clerk.minusProduct();
        }
    }
}

// 资源类
class Clerk {
    private int productNum = 0;// 产品数量
    private static final int MAX_PRODUCT = 20;
    private static final int MIN_PRODUCT = 1;

    // 增加产品
    public synchronized void addProduct() {
        if (productNum < MAX_PRODUCT) {
            productNum++;
            System.out.println(Thread.currentThread().getName() +
                    "生产了第" + productNum + "个产品");
            // 唤醒消费者
            this.notifyAll();
        } else {

            try {
                // 没有了，阻塞
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // 减少产品
    public synchronized void minusProduct() {
        if (productNum >= MIN_PRODUCT) {
            System.out.println(Thread.currentThread().getName() +
                    "消费了第" + productNum + "个产品");
            productNum--;

            // 唤醒生产者
            this.notifyAll();
        } else {

            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}