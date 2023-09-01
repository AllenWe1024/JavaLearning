interface A3 {
    void a();
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        new A3() {
            @Override
            public void a() {
                System.out.println("aaaa");
            }
        }.a();
    }
}