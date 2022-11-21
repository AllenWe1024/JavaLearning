public class AbstractClass {
    public static void main(String[] args) {
        Person1231 p = new Student1231();
        p.run();
    }
}

abstract class Person1231 {
    public abstract void run();
}

class Student1231 extends Person1231 {
    @Override
    public void run() {
        System.out.println("Student.run");
    }
}


