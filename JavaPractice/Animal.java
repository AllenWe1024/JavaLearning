class Animal1 {
    void eat() {
        System.out.println("animal : eat");
    }
}

class Dog extends Animal1 {
    void eat() {
        System.out.println("dog : eat");
    }
    void eatTest() {
        this.eat();   // this 调用自己的方法
        super.eat();  // super 调用父类方法
    }
}

public class Animal {
    public static void main(String[] args) {
        Animal1 a = new Animal1();
        a.eat();
        Dog d = new Dog();
        d.eatTest();
    }
}