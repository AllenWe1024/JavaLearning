public class StaticTest2 {
    public static void main(String[] args) {
        Demo test = null;
        test.hello();
    }
}

class Demo {
    public static void hello() {
        System.out.println("hello!");
    }
}