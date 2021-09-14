public class 变量类型 {

    static int a = 10;

    public static void main(String[] args) {
        Variable v1 = new Variable();
        System.out.printf("%s", v1.str);
    }
}
class Variable {
    int allClicks = 0;    // 类变量

    String str = "hello world";  // 实例变量

    public void method() {

        int i = 0;  // 局部变量

    }
}
