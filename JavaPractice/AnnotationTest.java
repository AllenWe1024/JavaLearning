public class AnnotationTest {

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int a = 10;
        Mytest test = new Mytest();
        test.print();
    }


    @Override
    public String toString() {
        return "重写的toString方法()";
    }
}

class Mytest {
    @Deprecated
    public void print() {
        System.out.println("过时的方法");
    }

}