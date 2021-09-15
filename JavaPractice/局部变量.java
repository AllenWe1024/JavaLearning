public class 局部变量 {
    public void pupAge() {
        int age = 0;
        age = age + 7;
        System.out.println("小狗的年龄是: " + age);
    }

    public static void main(String[] args) {
        局部变量 test = new 局部变量();
        test.pupAge();
    }
}
