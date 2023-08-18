public class 成员变量没有多态性 {
    //    public class TestVariable {
    public static void main(String[] args) {
        Base b = new Sub();
        System.out.println(b.a); // 父类的1
        System.out.println(((Sub) b).a); // 子类的2
        Sub s = new Sub();
        System.out.println(s.a);
        System.out.println(((Base) s).a);
    }
//    }


}

class Base {
    int a = 1;
}

class Sub extends Base {
    int a = 2;
}