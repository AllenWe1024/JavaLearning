class Account {
    // 账户余额为money
    private double money;

    // 有参构造器
    public Account(double money) {
        this.money = money;
    }

    // 存钱方法
    public void cunqian(double jine) {
        if (jine > 0) {
            // 用同步代码块的方式解决线程安全问题，同步监视器为Account.class
            synchronized (Account.class) {
                // Account.class.notify();
                money += 1000;

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + "-存款，账户余额为：" + money);
                //
                // try {
                //     Account.class.wait();
                // } catch (InterruptedException e) {
                //     e.printStackTrace();
                // }
            }
        }
    }
}

class userTest extends Thread {
    private Account account;

    // 有参构造器
    public userTest(Account account) {
        this.account = account;
    }

    // 重写run方法
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.cunqian(1000);
        }
    }
}

public class AccountTest {
    public static void main(String[] args) {
        Account acc = new Account(0);
        // 创建两个User对象 （两个线程）
        userTest u1 = new userTest(acc);
        userTest u2 = new userTest(acc);
        // 为两个对象（线程）命名
        u1.setName("甲");
        u2.setName("乙");

        u1.start();
        u2.start();
    }
}
