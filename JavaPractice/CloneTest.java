//Object类的clone()的使用
public class CloneTest {
    public static void main(String[] args) {
        AnimalCloneTest a1 = new AnimalCloneTest("花花");
        try {
            AnimalCloneTest a2 = (AnimalCloneTest) a1.clone();
            System.out.println("原始对象：" + a1);
            a2.setName("毛毛");
            System.out.println("clone之后的对象：" + a2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

class AnimalCloneTest implements Cloneable {
    private String name;

    public AnimalCloneTest() {
        super();
    }

    public AnimalCloneTest(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override //重载原本显示对象的toString
    public String toString() {
        return "AnimalCloneTest [name=" + name + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

}