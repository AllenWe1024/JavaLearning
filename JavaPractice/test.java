import java.util.ArrayList;
import java.util.Collection;

public class test {

    public static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        for (T o : a) {
            c.add(o);
        }
    }

    public static void main(String[] args) {
        Object[] ao = new Object[100];
        Collection<Object> co = new ArrayList<Object>();
        fromArrayToCollection(ao, co);

        String[] sa = new String[20];
        Collection<String> cs = new ArrayList<>();
        fromArrayToCollection(sa, cs);

        Collection<Double> cd = new ArrayList<>();
        // 下面代码中T是Double类，但sa是String类型，编译错误。
        // fromArrayToCollection(sa, cd);
        // 下面代码中T是Object类型，sa是String类型，可以赋值成功。
        fromArrayToCollection(sa, co);
    }

}





