public class InnerClass {
    public static void main(String[] args) {
        Outer2 outer = new Outer2("Nested"); // 实例化一个Outer
        Outer2.Inner inner = outer.new Inner(); // 实例化一个Inner
        inner.hello();
    }
}

class Outer2 {
    private String name;

    Outer2(String name) {
        this.name = name;

    }

    class Inner {
        void hello() {
            System.out.println("Hello, " + Outer2.this.name);
        }
    }
}
