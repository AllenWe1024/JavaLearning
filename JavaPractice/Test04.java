import java.util.HashSet;

public class Test04 {

    public static void main(String[] args) {
        HashSet set = new HashSet();
        Person p1 = new Person(1001, "AA");
        Person p2 = new Person(1002, "BB");

        set.add(p1);
        set.add(p2);
        System.out.println("0:");
        System.out.println(set);

        p1.name = "CC";
        set.remove(p1); // 此时已修改
        System.out.println("1:");
        System.out.println(set);
        set.add(new Person(1001, "CC"));

        System.out.println("2:");
        System.out.println(set);

        set.add(new Person(1001, "AA"));

        System.out.println("3:");
        System.out.println(set);

        // 其中Person类中重写了hashCode()和equal()方法

        HashSet<Integer> set2 = new HashSet();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        System.out.println("a" + set2);

        set2.remove(2);
        System.out.println("b" + set2);

    }
}

/**
 * Person
 */
class Person {

    public int id;
    public String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

}