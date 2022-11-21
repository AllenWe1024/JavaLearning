public class 引用传递2 {
    public static void main(String[] args) {
        PersonTest p1 = new PersonTest("Xiao Ming", 15); // 既可以调用带参数的构造方法
        PersonTest p2 = new PersonTest(); // 也可以调用无参数构造方法
        System.out.println(p1.name);
    }
}

class PersonTest {
    public String name = "unamed";
    public int age = 10;

    public PersonTest() {
    }

    public PersonTest(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
