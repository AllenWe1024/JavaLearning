public class 多态调用方法 {
    //考查多态的笔试题目：
//    public class InterviewTest1 {
    public static void main(String[] args) {
        Base3 base = new Sub3();
        base.add(1, 2, 3);
        // Sub s = (Sub)base;
        // s.add(1,2,3);} }

    }
//    }
}

class Base3 {
    public void add(int a, int... arr) {
        System.out.println("base");
    }
}

class Sub3 extends Base3 {
    public void add(int a, int[] arr) {
        System.out.println("sub_1");
    }
    // public void add(int a, int b, int c) {
    // System.out.println("sub_2");
    // }
}