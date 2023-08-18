public class 继承成员变量和继承方法的区别 {
    //    public class FieldMethodTest {
    public static void main(String[] args) {
        Sub2 s = new Sub2();
        System.out.println(s.count);
        s.display();
        Base2 b = s;
        System.out.println(b == s);
        System.out.println(b.count);
        b.display();
    }
//    }
}

class Base2 {
    int count = 10;

    public void display() {
        System.out.println(this.count);
    }
}

class Sub2 extends Base2 {
    int count = 20;

    public void display() {
        System.out.println(this.count);
    }
}

