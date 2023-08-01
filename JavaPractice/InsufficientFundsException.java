// 文件名InsufficientFundsException.java

//自定义异常类，继承Exception类
public class InsufficientFundsException extends Exception {
    // 此处的amount用来储存当出现异常（取出钱多于余额时）所缺乏的钱
    private double amount;

    public InsufficientFundsException(double amount) {
        this.amount = amount;
    }

    int test01 = 0;
    
    public double getAmount() {
        return amount;
    }
}