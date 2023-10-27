public class SaleTicketDemo5 {
    public static void main(String[] args) {
        // 2、创建资源对象
        Ticket ticket = new Ticket();

        // 3、启动多个线程操作资源类的对象
        Thread t1 = new Thread("窗口一") {
            public void run() {// 不能给run()直接加锁，因为t1,t2,t3的三个run方法分别属于三个Thread类对象，
                // run方法是非静态方法，那么锁对象默认选this，那么锁对象根本不是同一个
                while (true) {
                    synchronized (ticket) {
                        ticket.sale();
                        System.out.println("t1的ticket地址：" + ticket.hashCode());
                    }
                }
            }
        };
        Thread t2 = new Thread("窗口二") {
            public void run() {
                while (true) {
                    synchronized (ticket) {
                        ticket.sale();
                        System.out.println("t2的ticket地址：" + ticket.hashCode());
                    }
                }
            }
        };
        Thread t3 = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    synchronized (ticket) {
                        ticket.sale();
                        System.out.println("t3的ticket地址：" + ticket.hashCode());
                    }
                }
            }
        }, "窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}

// 1、编写资源类
class Ticket {
    private int ticket = 1000;

    public void sale() {// 也可以直接给这个方法加锁，锁对象是this，这里就是Ticket对象
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "卖出一张票，票号:" + ticket);
            ticket--;
        } else {
            throw new RuntimeException("没有票了");
        }
    }

    public int getTicket() {
        return ticket;
    }
}
