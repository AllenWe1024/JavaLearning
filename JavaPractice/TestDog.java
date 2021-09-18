class Animal3{
    public void move(){
        System.out.println("动物可以移动");
    }
}

class Dog3 extends Animal3{
    public void move(){
        System.out.println("狗可以跑和走");
    }
    public void bark(){
        System.out.println("狗可以吠叫");
    }
}

public class TestDog{
    public static void main(String args[]){
        Animal3 a = new Animal3(); // Animal 对象
        Dog3 b = new Dog3(); // Dog 对象

        a.move();// 执行 Animal 类的方法
        b.move();//执行 Dog 类的方法
        b.bark();
    }
}