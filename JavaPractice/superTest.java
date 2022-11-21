public class superTest {
    public static void main(String[] args) {
        Student123 s = new Student123("Xiao Ming", 12, 89);
    }
}

class Person123 {
    protected String name;
    protected int age;

    public Person123(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student123 extends Person123 {
    protected int score;

    public Student123(String name, int age, int score) {
        super(name, age); // 调用父类的构造方法Person(String, int)
        this.score = score;
    }
}


