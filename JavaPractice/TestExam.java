public class TestExam {
    public static void main(String[] args) {
        int i = 1;
        Integer j = new Integer(2);
        Circle c = new Circle();
        change(i,j,c);
        System.out.println("i = " + i);//1
        System.out.println("j = " + j);//2
        System.out.println("c.radius = " + c.radius);//10.0
    }

    /*
     * 方法的参数传递机制：
     * （1）基本数据类型：形参的修改完全不影响实参
     * （2）引用数据类型：通过形参修改对象的属性值，会影响实参的属性值
     * 这类Integer等包装类对象是“不可变”对象，即一旦修改，就是新对象，和实参就无关了
     */
    public static void change(int a ,Integer b,Circle c ){
        a += 10;
//		b += 10;//等价于  b = new Integer(b+10);
        c.radius += 10;
		/*c = new Circle();
		c.radius+=10;*/
    }
}
class Circle{
    double radius;
}